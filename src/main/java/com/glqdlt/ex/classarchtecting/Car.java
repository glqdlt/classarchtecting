package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public abstract class Car {

    private Driver driver;

    public String driving() {
        Driver driver = checkDriver();
        if (driver == null) {
            throw new RuntimeException("Driver is empty");
        }
        String sound = drivingSound();
        System.out.println(String.format("%s 과 함께~ %s", driver.getName(), sound));
        return sound;
    }

    public abstract String drivingSound();

    public Driver checkDriver() {
        return this.driver;
    }

    public void inToDriver(Driver driver) {
        this.driver = driver;
    }

    public void outDriver() {
        this.driver = null;
    }
}
