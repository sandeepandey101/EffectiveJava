package com.org.jdevexperts.effectivejava.item3;

/**
 * First Way of creating singleton is making static instance while 
 * load of the class and allowing clients to directly access static access.
 * 
 *  Pros:
 *  1: This approach is simple.
 *  2: This is thread safe as well and ensure singleton property always.
 * 
 *  Cons:
 *  1: Client may create instance of this class via reflection . So be immune from this
 *  attack change your constructor such that it throws exception if its invoked more
 *  than 1 times.
 */
public class FirstSingletonDemo {

    // static creation
    public static final FirstSingletonDemo INSTANCE = new FirstSingletonDemo();

    /**
     * Private constructor
     */
    private FirstSingletonDemo() {

    }
}