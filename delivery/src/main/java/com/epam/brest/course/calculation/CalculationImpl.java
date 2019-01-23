package com.epam.brest.course.calculation;

import java.math.BigDecimal;

/**
 * The type Calculation.
 */
public class CalculationImpl implements Calculation {


    @Override
    public BigDecimal calculate(BigDecimal weight, BigDecimal distance) {
        return weight.add(distance);
    }

    @Override
    public BigDecimal calculate(BigDecimal weight, BigDecimal distance, BigDecimal securityLevel) {
        return weight.add(distance).multiply(securityLevel);
    }

    @Override
    public BigDecimal calculate(DeliveryCostModel deliveryCostModel) {
        return BigDecimal.valueOf(deliveryCostModel.getWeight()).add(BigDecimal.valueOf(deliveryCostModel.getDistance())).multiply(BigDecimal.valueOf(deliveryCostModel.getSecurityLevel()));
    }

}
