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
    public void sonata() {
        Driver simpleMan = new Driver("simple", Gender.MAN);
        Car sonata = new Sonata();
        sonata.inToDriver(simpleMan);
        Assert.assertEquals("탈탈탈탈...", sonata.driving());
    }
}