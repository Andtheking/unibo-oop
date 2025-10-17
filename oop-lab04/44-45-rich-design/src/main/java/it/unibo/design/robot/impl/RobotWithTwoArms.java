package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {
    private static int ARMS_COUNT = 2;
    public static final double HOLD_DELTA_CONSUMPTION_PER_ARM = 0.3;

    private BaseArm left;
    private BaseArm right;
    private int carried_items;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.left = new BaseArm("Sinistro");
        this.right = new BaseArm("Destro");
        this.carried_items = 0;
    }
    
    @Override
    protected void consumeBattery(double amount) {
        super.consumeBattery(amount + getCarriedItemsCount() * HOLD_DELTA_CONSUMPTION_PER_ARM);
    }

    @Override
    public boolean pickUp() {
        BaseArm freeArm = getFreeArm();
        if (freeArm == null) {
            return false; 
        }
        freeArm.pickUp();
        this.consumeBattery(freeArm.getConsumptionForPickUp());
        this.carried_items++;
        return true;
    }
    
    @Override
    public boolean dropDown() {
        if (areAllArmsFree()) {
            return false;
        }
        BaseArm busyArm = getBusyArm();
        busyArm.dropDown();
        this.consumeBattery(busyArm.getConsumptionForDropDown());
        this.carried_items--;
        return true;
    }
    
    @Override
    public int getCarriedItemsCount() {
        return this.carried_items;
    }

    private BaseArm getFreeArm() {
        if (areAllArmsBusy()) return null;
        if (!this.right.isGrabbing()) return this.right;
        return this.left;
    }

    private BaseArm getBusyArm() {
        if (areAllArmsFree()) return null;
        if (this.right.isGrabbing()) return this.right;
        return this.left;
    }

    private boolean areAllArmsFree() {
        return getCarriedItemsCount() == 0;
    }

    private boolean areAllArmsBusy() {
        return getCarriedItemsCount() == ARMS_COUNT;
    }

}
