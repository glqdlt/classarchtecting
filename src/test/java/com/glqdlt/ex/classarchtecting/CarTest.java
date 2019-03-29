package com.glqdlt.ex.classarchtecting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jhun
 * 2019-03-29
 */
public class CarTest {

    @Test
    public void ferrari() {
        Driver simpleMan = new Driver("simple", Gender.MAN);
        Car sonata = new Ferrari();
        sonata.inToDriver(simpleMan);
        Assert.assertEquals("뿌웨에에에에엥~~~@@@@", sonata.driving());
    }

    @Test
    public void carEvent() {
        CarEventStep carEventStep = new CarEventStep();
        CarEvent carEvent = new CarEvent(carEventStep);
        carEvent.run();
    }

    @Test
    public void carEventWithTestCar() {
        TestDriver tester = new TestDriver("testman", Gender.MAN);
        tester.greeting();
        CarEventStep carEventStep = new CarEventStep(new TestEventCar(), tester);
        CarEvent carEvent = new CarEvent(carEventStep);
        carEvent.run();
    }
}