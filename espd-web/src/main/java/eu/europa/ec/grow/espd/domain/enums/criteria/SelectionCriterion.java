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

package eu.europa.ec.grow.espd.domain.enums.criteria;

import eu.europa.ec.grow.espd.domain.ubl.CcvCriterion;
import eu.europa.ec.grow.espd.domain.ubl.CcvRequirementGroup;
import eu.europa.ec.grow.espd.domain.ubl.CcvCriterionType;
import eu.europa.ec.grow.espd.domain.ubl.CcvLegislation;
import lombok.Getter;

import java.util.List;

import static eu.europa.ec.grow.espd.domain.enums.criteria.ListUtil.list;

/**
 * Created by vigi on 11/17/15:3:11 PM.
 */
@Getter
public enum SelectionCriterion implements CcvCriterion {

    /**
     *
     */
    ALL_SELECTION_CRITERIA_SATISFIED("7e7db838-eeac-46d9-ab39-42927486f22d", "All selection criteria will be satisfied",
            "It satisfies all the required selection criteria indicated in the relevant notice or in the procurement documents referred to in the notice.",
            SelectionCriterionTypeCode.ALL_CRITERIA_SATISFIED, null, list(
            SelectionRequirementGroup.ALL_CRITERIA_SATISFIED_GROUP),
            "selectionSatisfiesAll"),
    /**
     *
     */
    ENROLMENT_PROFESSIONAL_REGISTER("6ee55a59-6adb-4c3a-b89f-e62a7ad7be7f",
            "Enrolment in a relevant professional register",
            "It is enrolled in relevant professional registers kept in the Member State of its establishment as described in Annex XI of Directive 2014/24/EU; economic operators from certain Member States may have to comply with other requirements set out in that Annex.",
            SelectionCriterionTypeCode.SUITABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_2,
            list(SelectionRequirementGroup.ENROLMENT_PROFESSIONAL_REGISTER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "enrolmentProfessionalRegister"),
    /**
     *
     */
    ENROLMENT_TRADE_REGISTER("87b3fa26-3549-4f92-b8e0-3fd8f04bf5c7", "Enrolment in a trade register",
            "It is enrolled in trade registers kept in the Member State of its establishment as described in Annex XI of Directive 2014/24/EU; economic operators from certain Member States may have to comply with other requirements set out in that Annex.",
            SelectionCriterionTypeCode.SUITABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_2,
            list(SelectionRequirementGroup.ENROLMENT_TRADE_REGISTER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "enrolmentTradeRegister"),
    /**
     *
     */
    SERVICE_CONTRACTS_AUTHORISATION("9eeb6d5c-0eb8-48e8-a4c5-5087a7c095a4",
            "For service contracts: authorisation of particular organisation needed",
            "Is a particular membership of a particular organisation needed in order to be able to perform the service in question in the country of establishment of the economic operator?",
            SelectionCriterionTypeCode.SUITABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_2,
            list(SelectionRequirementGroup.SERVICE_CONTRACTS_AUTHORISATION_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "serviceContractsAuthorisation"),
    /**
     *
     */
    SERVICE_CONTRACTS_MEMBERSHIP("73f10e36-ed7a-412e-995c-aa76463e3776",
            "For service contracts: membership of particular organisation needed",
            "Is a particular membership of a particular organisation needed in order to be able to perform the service in question in the country of establishment of the economic operator?",
            SelectionCriterionTypeCode.SUITABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_2,
            list(SelectionRequirementGroup.SERVICE_CONTRACTS_MEMBERSHIP_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "serviceContractsMembership"),
    /**
     *
     */
    GENERAL_YEARLY_TURNOVER("499efc97-2ac1-4af2-9e84-323c2ca67747", "General yearly turnover",
            "Its general yearly turnover for the number of financial years required in the relevant notice, the procurement documents or the ESPD is as follows:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.GENERAL_YEARLY_TURNOVER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "generalYearlyTurnover"),
    /**
     *
     */
    AVERAGE_YEARLY_TURNOVER("b16cb9fc-6cb7-4585-9302-9533b415cf48", "Average yearly turnover",
            "Its average yearly turnover for the number of years required in the relevant notice, the procurement documents or the ESPD is as follows:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.AVERAGE_YEARLY_TURNOVER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "averageYearlyTurnover"),
    /**
     *
     */
    SPECIFIC_YEARLY_TURNOVER("074f6031-55f9-4e99-b9a4-c4363e8bc315", "Specific yearly turnover",
            "Its specific yearly turnover in the business area covered by the contract for the number of financial years required in the relevant notice, the procurement documents or the ESPD is as follows:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.SPECIFIC_YEARLY_TURNOVER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "specificYearlyTurnover"),
    /**
     *
     */
    SPECIFIC_AVERAGE_TURNOVER("d3dfb714-f558-4512-bbc5-e456fa2339de", "Specific average turnover",
            "Its specific average yearly turnover in the business area covered by the contract for the number of years required in the relevant notice, the procurement documents or the ESPD is as follows:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.SPECIFIC_AVERAGE_TURNOVER_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "specificAverageTurnover"),
    /**
     *
     */
    SETUP_ECONOMIC_OPERATOR("77f481ce-ffb6-483f-8e2b-c78db5e68292", "Set up of economic operator",
            "In case the information concerning turnover (general or specific) is not available for the entire period required, please state the date on which the economic operator was set up or started trading:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.SETUP_ECONOMIC_OPERATOR_GROUP), "setupEconomicOperator"),
    /**
     *
     */
    FINANCIAL_RATIO("e4d37adc-08cd-4f4d-a8d8-32b62b0a1f46", "Financial ratio",
            "Concerning the financial ratios  specified in the relevant notice, the procurement documents or the ESPD, the economic operator declares that the actual values for the required ratios are as follows:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.FINANCIAL_RATIO_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "financialRatio"),
    /**
     *
     */
    PROFESSIONAL_RISK_INSURANCE("7604bd40-4462-4086-8763-a50da51a869c", "Professional risk indemnity insurance",
            "The insured amount in its professional risk indemnity insurance is the following:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.PROFESSIONAL_RISK_INSURANCE_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "professionalRiskInsurance"),
    /**
     *
     */
    OTHER_ECONOMIC_OR_FINANCIAL_REQUIREMENTS("ab0e7f2e-6418-40e2-8870-6713123e41ad",
            "Other economic or financial requirements",
            "Concerning the other economic or financial requirements, if any, that may have been specified in the relevant notice or the procurement documents, the economic operator declares that:",
            SelectionCriterionTypeCode.ECONOMIC_FINANCIAL_STANDING, LegislationReference.DIRECTIVE_2014_24_EU_58_3,
            list(SelectionRequirementGroup.OTHER_ECONOMIC_OR_FINANCIAL_REQUIREMENTS_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "otherEconomicFinancialRequirements"),
    /**
     *
     */
    WORK_CONTRACTS_PERFORMANCE_OF_WORKS("cdd3bb3e-34a5-43d5-b668-2aab86a73822",
            "For works contracts: performance of works of the specified type",
            "For public works contracts only: During the reference period, the economic operator has performed the following works of the specified type. Contracting authorities may require up to five years and allow experience dating from more than five years.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_1, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_2,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_3, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_4,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_5, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "workContractsPerformanceOfWorks"),
    /**
     *
     */
    SUPPLY_CONTRACTS_PERFORMANCE_OF_DELIVERIES("3a18a175-1863-4b1d-baef-588ce61960ca",
            "For supply contracts: performance of deliveries of the specified type",
            "For public supply contracts only: During the reference period, the economic operator has delivered the following principal deliveries of the type specified. Contracting authorities may require up to three years and allow experience dating from more than three years.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_1, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_2,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_3, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_4,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_5, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "supplyContractsPerformanceDeliveries"),
    /**
     *
     */
    SERVICE_CONTRACTS_PERFORMANCE_OF_SERVICES("5e506c16-26ab-4e32-bb78-b27f87dc0565",
            "For service contracts: performance of services of the specified type",
            "For public service contracts only: During the reference period, the economic operator has provided the following main services of the type specified. Contracting authorities may require up to three years and allow experience dating from more than three years.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_1, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_2,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_3, SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_4,
                    SelectionRequirementGroup.DESCRIPTION_AMOUNT_DATE_RECIPIENTS_GROUP_5, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "serviceContractsPerformanceServices"),
    /**
     *
     */
    TECHNICIANS_OR_TECHNICAL_BODIES("3aaca389-4a7b-406b-a4b9-080845d127e7",
            "Technicians or technical bodies for quality control",
            "It can call upon the following technicians or technical bodies, especially those responsible for quality control. For technicians or technical bodies not belonging directly to the economic operator's undertaking but on whose capacities the economic operator relies as set out under Part II, Section C, separate ESPD forms must be filled in.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.TECHNICIANS_OR_TECHNICAL_BODIES_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "techniciansTechnicalBodies"),
    /**
     *
     */
    WORK_CONTRACTS_TECHNICIANS_OR_TECHNICAL_BODIES("c599c130-b29f-461e-a187-4e16c7d40db7",
            "For works contracts: technicians or technical bodies to carry out the work",
            "In the case of public works contracts, the economic operator will be able to call on the following technicians or technical bodies to carry out the work:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.WORK_CONTRACTS_TECHNICIANS_OR_TECHNICAL_BODIES_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "workContractsTechnicians"),
    /**
     *
     */
    TECHNICAL_FACILITIES_AND_MEASURES("4bf996d9-439c-40c6-9ab9-980a48cb55a1",
            "Technical facilities and measures for ensuring quality",
            "It uses the following technical facilities and measures for ensuring quality and its study and research facilities are as follows:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.TECHNICAL_FACILITIES_AND_MEASURES_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "technicalFacilitiesMeasures"),
    /**
     *
     */
    STUDY_AND_RESEARCH_FACILITIES("90a2e100-44cc-45d3-9970-69d6714f1596", "Study and research facilities",
            "It uses the following study and research facilities are as follows:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.STUDY_AND_RESEARCH_FACILITIES_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "studyResearchFacilities"),
    /**
     *
     */
    SUPPLY_CHAIN_MANAGEMENT("dc12a151-7fdf-4733-a8f0-30f667292e66", "Supply chain management",
            "It will be able to apply the following supply chain management and tracking systems when performing the contract:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.SUPPLY_CHAIN_MANAGEMENT_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "supplyChainManagement"),
    /**
     *
     */
    ALLOWANCE_OF_CHECKS("c8809aa1-29b6-4f27-ae2f-27e612e394db", "Allowance of checks",
            "For complex products or services to be supplied or, exceptionally, for products or services which are required for a special purpose: The economic operator will allow checks  to be conducted on the production capacities or the technical capacity of the economic operator and, where necessary, on the means of study and research which are available to it and on the quality control measures? The check is to be performed by the contracting authority or, in case the latter consents to this, on its behalf by a competent official body of the country in which the supplier or service provider is established.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.ALLOWANCE_OF_CHECKS_GROUP), "allowanceOfChecks"),
    /**
     *
     */
    EDUCATIONAL_AND_PROFESSIONAL_QUALIFICATIONS("07301031-2270-41af-8e7e-66fe0c777107",
            "Educational and professional qualifications",
            "The following educational and professional qualifications are held by the service provider or the contractor itself, and/or (depending on the requirements set out in the relevant notice or the procurement documents by its managerial staff.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.EDUCATIONAL_AND_PROFESSIONAL_QUALIFICATIONS_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "educationalProfessionalQualifications"),
    /**
     *
     */
    ENVIRONMENTAL_MANAGEMENT_FEATURES("9460457e-b43d-48a9-acd1-615de6ddd33e", "Environmental management measures",
            "The economic operator will be able to apply the following environmental management measures when performing the contract:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.ENVIRONMENTAL_MANAGEMENT_FEATURES_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "environmentalManagementFeatures"),
    /**
     *
     */
    NUMBER_OF_MANAGERIAL_STAFF("6346959b-e097-4ea1-89cd-d1b4c131ea4d", "Number of managerial staff",
            "The economic operator’s number of managerial staff for the last three years were as follows:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.YEAR_NUMBER_GROUP_1, SelectionRequirementGroup.YEAR_NUMBER_GROUP_2, SelectionRequirementGroup.YEAR_NUMBER_GROUP_3, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "numberManagerialStaff"),
    /**
     *
     */
    AVERAGE_ANNUAL_MANPOWER("1f49b3f0-d50f-43f6-8b30-4bafab108b9b", "Average annual manpower",
            "The economic operator’s average annual manpower for the last three years were as follows:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.YEAR_NUMBER_GROUP_1, SelectionRequirementGroup.YEAR_NUMBER_GROUP_2, SelectionRequirementGroup.YEAR_NUMBER_GROUP_3, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "averageAnnualManpower"),
    /**
     *
     */
    TOOLS_PLANT_TECHNICAL_EQUIPMENT("cc18c023-211d-484d-a32e-52f3f970285f", "Tools, plant or technical equipment",
            "The following tools, plant or technical equipment will be available to it for performing the contract:",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.TOOLS_PLANT_TECHNICAL_EQUIPMENT_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "toolsPlantTechnicalEquipment"),
    /**
     *
     */
    SUBCONTRACTING_PROPORTION("612a1625-118d-4ea4-a6db-413184e7c0a8", "Subcontracting proportion",
            "The economic operator intends possibly to subcontract  the following proportion (i.e. percentage) of the contract. Please note that if the economic operator has decided to subcontract a part of the contract and relies on the subcontractor’s capacities to perform that part, then please fill in a separate ESPD for such subcontractors, see Part II, Section C above.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.SUBCONTRACTING_PROPORTION_GROUP), "subcontractingProportion"),
    /**
     *
     */
    SUPPLY_CONTRACTS_SAMPLES_DESCRIPTIONS_WITHOUT_CA("bdf0601d-2480-4250-b870-658d0ee95be6",
            "For supply contracts: samples, descriptions or photographs without certification of authenticity",
            "For public supply contracts: The economic operator will supply the required samples, descriptions or photographs of the products to be supplied, which do not need to be accompanied by certifications of authenticity.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.SUPPLY_CONTRACTS_SAMPLES_DESCRIPTIONS_WITHOUT_CA_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "supplyContractsSamplesDescriptionsWithoutCa"),
    /**
     *
     */
    SUPPLY_CONTRACTS_SAMPLES_DESCRIPTIONS_WITH_CA("7662b7a9-bcb8-4763-a0a7-7505d8e8470d",
            "For supply contracts: samples, descriptions or photographs with certification of authenticity",
            "For public supply contracts: The economic operator will supply the required samples, descriptions or photographs of the products to be supplied and will provide certifications of authenticity where applicable.",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.SUPPLY_CONTRACTS_SAMPLES_DESCRIPTIONS_WITH_CA_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "supplyContractsSamplesDescriptionsWithCa"),
    /**
     *
     */
    SUPPLY_CONTRACTS_CERTIFICATES_QC("a7669d7d-9297-43e1-9d10-691a1660187c",
            "For supply contracts: certificates by quality control institutes",
            "Can the economic operator provide the required certificates drawn up by official quality control institutes or agencies of recognised competence attesting the conformity of products clearly identified by references to the technical specifications or standards, which are set out in the relevant notice or the procurement documents?",
            SelectionCriterionTypeCode.TECHNICAL_PROFESSIONAL_ABILITY, LegislationReference.DIRECTIVE_2014_24_EU_58_4,
            list(SelectionRequirementGroup.SUPPLY_CONTRACTS_CERTIFICATES_QC_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP), "supplyContractsCertificatesQc"),
    /**
     *
     */
    CERTIFICATE_INDEPENDENT_BODIES_ABOUT_QA("d726bac9-e153-4e75-bfca-c5385587766d",
            "Certificates by independent bodies about quality assurance standards",
            "Will the economic operator be able to produce certificates drawn up by independent bodies attesting that the economic operator complies with the required quality assurance standards, including accessibility for disabled persons?",
            SelectionCriterionTypeCode.QUALITY_ASSURANCE, LegislationReference.DIRECTIVE_2014_24_EU_62_2,
            list(SelectionRequirementGroup.CERTIFICATE_INDEPENDENT_BODIES_ABOUT_QA_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "certificateIndependentBodiesAboutQa"),
    /**
     *
     */
    CERTIFICATE_INDEPENDENT_BODIES_ABOUT_ENVIRONMENTAL("8ed65e48-fd0d-444f-97bd-4f58da632999",
            "Certificates by independent bodies about environmental management systems or standards",
            "Will the economic operator be able to produce certificates drawn up by independent bodies attesting that the economic operator complies with the required environmental management systems or standards?",
            SelectionCriterionTypeCode.QUALITY_ASSURANCE, LegislationReference.DIRECTIVE_2014_24_EU_62_2,
            list(SelectionRequirementGroup.CERTIFICATE_INDEPENDENT_BODIES_ABOUT_ENVIRONMENTAL_GROUP, SelectionRequirementGroup.INFO_ELECTRONICALLY_GROUP),
            "certificateIndependentBodiesAboutEnvironmental");

    private final String uuid;

    private final String shortName;

    private final String description;

    private final SelectionCriterionTypeCode criterionTypeCode;

    private final LegislationReference legislationReference;

    private final List<? extends CcvRequirementGroup> groups;

    private final String espdDocumentField;

    SelectionCriterion(String uuid, String shortName, String description, SelectionCriterionTypeCode criterionTypeCode,
            LegislationReference legislationReference, List<? extends CcvRequirementGroup> groups,
            String espdDocumentField) {
        this.uuid = uuid;
        this.shortName = shortName;
        this.description = description;
        this.criterionTypeCode = criterionTypeCode;
        this.legislationReference = legislationReference;
        this.groups = groups;
        this.espdDocumentField = espdDocumentField;
    }

    @Override
    public String getTypeCode() {
        return CriterionType.SELECTION.name() + "." + getCriterionTypeCode().name();
    }

    @Override
    public String getName() {
        return getShortName();
    }

    @Override
    public CcvLegislation getLegislation() {
        return legislationReference;
    }

    @Override
    public CcvCriterionType getCriterionType() {
        return this.criterionTypeCode;
    }

}
