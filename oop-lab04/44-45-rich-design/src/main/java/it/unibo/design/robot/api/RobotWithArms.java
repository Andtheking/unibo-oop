package it.unibo.design.robot.api;

public interface RobotWithArms extends Robot {
    /**
     * Picks an object
     * 
     * @return true if the action is successful
    */
    boolean pickUp();
    
    /**
     * Drops an object
     * 
     * @return true if the action is successful
     */
    boolean dropDown();

    /**
     * @return the number of objects this robot is currently transporting
     */
    int getCarriedItemsCount();

}
