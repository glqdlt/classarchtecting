package com.glqdlt.ex.classarchtecting;

import org.junit.Test;

/**
 * @author Jhun
 * 2019-03-29
 */
public class SimpleHelperLibTest {

    @Test
    public void doSomeThing() {

        SimpleHelperLib simpleHelperLib = new SimpleHelperLib(new SimpleOption() {
            public String getOption() {
                return "hi";
            }
        });

        simpleHelperLib.doSomeThing();

    }
}