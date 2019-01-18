package com.epam.brest.course;

import java.math.BigDecimal;

public class DeliveryCost {

    private BigDecimal weight;
    private BigDecimal distance;

    public DeliveryCost() {
    }

    public DeliveryCost(BigDecimal weight, BigDecimal distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        if (weight.compareTo(BigDecimal.ZERO) == 0) throw new IllegalArgumentException("Weight should not be negative");
        this.weight = weight;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        if (distance.compareTo(BigDecimal.ZERO) == 0) throw new IllegalArgumentException("Distance should not be negative");
        this.distance = distance;
    }

    public BigDecimal cost() {
        return weight.multiply(distance);
    }

}
