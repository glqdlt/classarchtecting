package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public class StandardCarEventStep extends CarEventStep {

    protected Car setCarWithDriver() {

        Ferrari ferrari = new Ferrari();
        ferrari.inToDriver(new Driver("standard-driver", Gender.MAN));

        return ferrari;
    }
}
