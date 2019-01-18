package com.epam.brest.course;

import java.math.BigDecimal;
import java.util.Scanner;

public class Terminal {

    private Scanner scanner;
    private DeliveryCost deliveryCost;

    public Terminal() {
        scanner = new Scanner(System.in);
        deliveryCost = new DeliveryCost();
        init();
    }

    private void init() {
        System.out.print("Enter the weight (kg): ");
        deliveryCost.setWeight(getValue());
        System.out.print("Enter the distance (km): ");
        deliveryCost.setDistance(getValue());
        System.out.print("Cost is " + deliveryCost.cost() + " ($)");
    }

    private BigDecimal getValue() {
        return scanner.nextBigDecimal();
    }

}
