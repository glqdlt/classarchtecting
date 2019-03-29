package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public class CarEvent {

    private CarEventStep carEventStep;

    public CarEvent(CarEventStep carEventStep) {
        this.carEventStep = carEventStep;
    }

    public void run() {
        Car eventCar = carEventStep.getCar();
        eventCar.driving();
    }
}
