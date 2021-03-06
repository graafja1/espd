/*
 *
 * Copyright 2016 EUROPEAN COMMISSION
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they
 * will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 *
 * You may not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 *
 * https://joinup.ec.europa.eu/community/eupl/og_page/eupl
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 *
 */

package eu.europa.ec.grow.espd.xml.response.selection

import eu.europa.ec.grow.espd.domain.enums.criteria.SelectionCriterion
import eu.europa.ec.grow.espd.domain.AvailableElectronically
import eu.europa.ec.grow.espd.domain.EspdDocument
import eu.europa.ec.grow.espd.domain.TechnicalProfessionalCriterion
import eu.europa.ec.grow.espd.xml.base.AbstractSelectionCriteriaFixture
/**
 * Created by ratoico on 12/9/15 at 1:48 PM.
 */
class SupplyContractsCertificatesByQCResponseTest extends AbstractSelectionCriteriaFixture {

    def "31. should contain the 'For supply contracts: certificates by quality control institutes' criterion"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then: "CriterionID element"
        checkCriterionId(request, idx, "a7669d7d-9297-43e1-9d10-691a1660187c")

        then: "CriterionTypeCode element"
        checkCriterionTypeCode(request, idx, "SELECTION.TECHNICAL_PROFESSIONAL_ABILITY")

        then: "CriterionName element"
        request.Criterion[idx].Name.text() == "For supply contracts: certificates by quality control institutes"

        then: "CriterionDescription element"
        request.Criterion[idx].Description.text() == "Can the economic operator provide the required certificates drawn up by official quality control institutes or agencies of recognised competence attesting the conformity of products clearly identified by references to the technical specifications or standards, which are set out in the relevant notice or the procurement documents?"

        then: "CriterionLegislationReference element"
        checkLegislationReference(request, idx, "58(4)")

        then: "check all the sub groups"
        request.Criterion[idx].RequirementGroup.size() == 2

        then: "main sub group"
        request.Criterion[idx].RequirementGroup[0].ID.text() == "4887c3d7-05fc-4e3e-b066-f338910f0c4c"
        request.Criterion[idx].RequirementGroup[0].RequirementGroup.size() == 0
        request.Criterion[idx].RequirementGroup[0].Requirement.size() == 2

        then: "main sub group requirements"
        def r1_0 = request.Criterion[idx].RequirementGroup[0].Requirement[0]
        checkRequirement(r1_0, "15335c12-ad77-4728-b5ad-3c06a60d65a4", "Your answer?", "INDICATOR")
        def r1_1 = request.Criterion[idx].RequirementGroup[0].Requirement[1]
        checkRequirement(r1_1, "b9dec4cb-2f6f-47d7-a023-e9099b19b338", "If not, please explain why and state which other means of proof can be provided:", "DESCRIPTION")

        then: "info available electronically sub group"
        checkInfoAvailableElectronicallyRequirementGroup(request.Criterion[idx].RequirementGroup[1])
    }

    def "check the 'Your answer' requirement response"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true, answer: false))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then:
        def subGroup = request.Criterion[idx].RequirementGroup[0]

        def req = subGroup.Requirement[0]
        checkRequirement(req, "15335c12-ad77-4728-b5ad-3c06a60d65a4", "Your answer?", "INDICATOR")
        req.Response.size() == 1
        req.Response[0].Indicator.text() == "false"
    }

    def "check the 'If not, please explain why and state which other means of proof can be provided:' requirements response"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true,
                description: "technical description"))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then:
        def subGroup = request.Criterion[idx].RequirementGroup[0]

        def req = subGroup.Requirement[1]
        req.Response.size() == 1
        req.Response[0].Description.text() == "technical description"
    }

    def "check the 'Is this information available electronically' requirement response"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true,
                availableElectronically: new AvailableElectronically(answer: false)))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then:
        def subGroup = request.Criterion[idx].RequirementGroup[1]

        def req = subGroup.Requirement[0]
        req.Response.size() == 1
        req.Response[0].Indicator.text() == "false"
    }

    def "check the 'Info electronically URL' requirement response"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true,
                availableElectronically: new AvailableElectronically(answer: true, url: "http://hodor_30.com")))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then:
        def subGroup = request.Criterion[idx].RequirementGroup[1]

        def req = subGroup.Requirement[1]
        req.Response.size() == 1
        checkEvidence(req.Response[0].Evidence, "http://hodor_30.com")
    }

    def "check the 'Info electronically code' requirement response"() {
        given:
        def espd = new EspdDocument(supplyContractsCertificatesQc: new TechnicalProfessionalCriterion(exists: true,
                availableElectronically: new AvailableElectronically(answer: true, code: "HODOR_30")))

        when:
        def request = parseResponseXml(espd)
        def idx = getResponseCriterionIndex(SelectionCriterion.SUPPLY_CONTRACTS_CERTIFICATES_QC)

        then:
        def subGroup = request.Criterion[idx].RequirementGroup[1]

        def req = subGroup.Requirement[2]
        req.Response.size() == 1
        req.Response[0].Code.text() == "HODOR_30"
    }

}