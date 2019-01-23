package com.epam.brest.course.calculation;

import java.math.BigDecimal;

/**
 * The interface Calculation.
 */
public interface Calculation {

    /**
     * Calculate big decimal.
     *
     * @param weight   the weight
     * @param distance the distance
     * @return the big decimal
     */
    BigDecimal calculate(BigDecimal weight, BigDecimal distance);

    /**
     * Calculate big decimal.
     *
     * @param weight        the weight
     * @param distance      the distance
     * @param securityLevel the security level
     * @return the big decimal
     */
    BigDecimal calculate(BigDecimal weight, BigDecimal distance, BigDecimal securityLevel);

    /**
     * Calculate big decimal.
     *
     * @param deliveryCostModel the delivery cost dto
     * @return the big decimal
     */
    BigDecimal calculate(DeliveryCostModel deliveryCostModel);

}
