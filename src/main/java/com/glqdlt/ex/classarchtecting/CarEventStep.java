package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public abstract class CarEventStep {

    Car getCar() {
        return this.car;
    }

    protected abstract Car setCarWithDriver();

    private Car car;

    CarEventStep() {
        this.car = setCarWithDriver();
    }


}
