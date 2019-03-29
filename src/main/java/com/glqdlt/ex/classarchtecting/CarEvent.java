package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public class CarEvent {

    public void setCarEventStep(CarEventStep carEventStep) {
        this.carEventStep = carEventStep;
    }

    private CarEventStep carEventStep;

    void run() {
        if (this.carEventStep == null) {
            this.carEventStep = new StandardCarEventStep();
        }
        Car eventCar = this.carEventStep.getCar();
        eventCar.driving();
    }
}
