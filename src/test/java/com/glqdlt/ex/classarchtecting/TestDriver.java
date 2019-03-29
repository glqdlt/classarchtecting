package com.glqdlt.ex.classarchtecting;

/**
 * @author Jhun
 * 2019-03-29
 */
public class TestDriver extends Driver {
    public TestDriver(String name, Gender gender) {
        super(name, gender);
    }

    public void greeting(){
        System.out.println("I'm Tester~");
    }
}
