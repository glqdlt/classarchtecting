package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public final class CarEventStep {

    public Car getCar() {
        if (this.car == null) {
            Driver simpleDriver = new Driver("test-driver", Gender.MAN);
            Ferrari ferrari = new Ferrari();
            ferrari.inToDriver(simpleDriver);
            return ferrari;
        } else {
            return car;
        }
    }


    public void setCarWithDriver(Car car, Driver driver) {
        car.inToDriver(driver);
        this.car = car;
    }

    private Car car;

    public CarEventStep() {
    }

    public CarEventStep(Car car, Driver driver) {
        setCarWithDriver(car, driver);
    }


}
