package com.glqdlt.ex.classarchtecting;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jhun
 * 2019-03-29
 */
//TODO 전략 패턴, 팩토리 패턴, 아답터 패턴 3가지를 구성해보자
public class CarTest {

    @Test
    public void ferrari() {
        Driver simpleMan = new Driver("simple", Gender.MAN);
        Car sonata = new Ferrari();
        sonata.inToDriver(simpleMan);
        Assert.assertEquals("페라뤼이이ㅣㅇ 뿌웨에에에에엥~~~@@@@", sonata.driving());
    }

    @Test
    public void carEvent() {
        CarEvent carEvent = new CarEvent();
        carEvent.run();
    }

    @Test
    public void carEventWithTestCar() {
        CarEvent carEvent = new CarEvent();
            carEvent.setCarEventStep(new CarEventStep() {
                @Override
                protected Car setCarWithDriver() {
                    TestDriver tester = new TestDriver("testman", Gender.MAN)
                    TestEventCar testEventCar = new TestEventCar();
                    testEventCar.inToDriver(tester);
                    return testEventCar;
                }
            });
        carEvent.run();
    }
}