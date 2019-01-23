package com.epam.brest.course.calculation.model;

import java.math.BigDecimal;

/**
 * The type Delivery cost.
 */
public class DeliveryCostModel {

    private BigDecimal weight;
    private BigDecimal distance;
    private BigDecimal securityLevel;

    /**
     * Instantiates a new Delivery cost.
     */
    public DeliveryCostModel() {
    }

    /**
     * Instantiates a new Delivery cost.
     *
     * @param weight   the weight
     * @param distance the distance
     */
    public DeliveryCostModel(Double weight, Double distance) {
        this.weight = BigDecimal.valueOf(weight);
        this.distance = BigDecimal.valueOf(distance);
    }

    /**
     * Instantiates a new Delivery cost dto.
     *
     * @param weight        the weight
     * @param distance      the distance
     * @param securityLevel the security level
     */
    public DeliveryCostModel(Double weight, Double distance, Double securityLevel) {
        this.weight = BigDecimal.valueOf(weight);
        this.distance = BigDecimal.valueOf(distance);
        this.securityLevel = BigDecimal.valueOf(securityLevel);
    }

    /**
     * Gets security level.
     *
     * @return the security level
     */
    public Double getSecurityLevel() {
        return securityLevel.doubleValue();
    }

    /**
     * Sets security level.
     *
     * @param securityLevel the security level
     */
    public void setSecurityLevel(Double securityLevel) {
        this.securityLevel = BigDecimal.valueOf(securityLevel);
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public Double getWeight() {
        return weight.doubleValue();
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(Double weight) {
        if (weight <= 0) throw new IllegalArgumentException("Weight should not be negative");
        this.weight = BigDecimal.valueOf(weight);
    }

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public Double getDistance() {
        return distance.doubleValue();
    }

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public void setDistance(Double distance) {
        if (distance <= 0) throw new IllegalArgumentException("Distance should not be negative");
        this.distance = BigDecimal.valueOf(distance);
    }

}
