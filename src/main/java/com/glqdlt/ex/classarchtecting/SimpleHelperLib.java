package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public class SimpleHelperLib {

    private final SimpleOption simpleOptions;

    public SimpleHelperLib(SimpleOption simpleOption) {
        this.simpleOptions = simpleOption;
    }

    public void doSomeThing() {
        System.out.println(simpleOptions.getOption());
    }

}
