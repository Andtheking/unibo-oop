package it.unibo.design.robot.impl;

public class BaseArm {
    private boolean grabbing;
    private String nome;

    private static final double CONSUMPTION_FOR_PICKUP = 1.2;
    private static final double CONSUMPTION_FOR_DROPDOWN = 1.2;



    public BaseArm(String s) {
        this.nome = s;    
    }

    boolean isGrabbing() {
        return this.grabbing;
    }

    void pickUp() {
        this.grabbing = true;
    }

    void dropDown() {
        this.grabbing = false;
    }

    double getConsumptionForPickUp() {
        return CONSUMPTION_FOR_PICKUP;
    }

    double getConsumptionForDropDown() {
        return CONSUMPTION_FOR_DROPDOWN;
    }

}