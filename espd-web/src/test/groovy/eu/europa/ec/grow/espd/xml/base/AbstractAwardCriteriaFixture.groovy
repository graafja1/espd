package eu.europa.ec.grow.espd.xml.base
import eu.europa.ec.grow.espd.criteria.enums.EconomicOperatorCriterion
import eu.europa.ec.grow.espd.criteria.enums.ExclusionCriterion
import eu.europa.ec.grow.espd.criteria.enums.SelectionCriterion

/**
 * Created by ratoico on 1/20/16 at 10:49 AM.
 */
class AbstractAwardCriteriaFixture extends AbstractCriteriaFixture {

    protected static int getCriterionIndex(EconomicOperatorCriterion criterion) {
        return ExclusionCriterion.values().size() + SelectionCriterion.values().size() + criterion.ordinal()
    }

    protected static int getTotalNumberOfCriteria() {
        return ExclusionCriterion.values().size() + SelectionCriterion.values().size() + EconomicOperatorCriterion.values().size()
    }

}