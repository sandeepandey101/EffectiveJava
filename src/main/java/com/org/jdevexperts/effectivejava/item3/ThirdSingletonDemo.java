package com.org.jdevexperts.effectivejava.item3;
/**
 * This method is pretty simple. and easy to write.
 * 
 * Pros:
 * - This way resembles similarity with first approach but this is more 
 *   concise and clean.
 * - This approach offer searlizability & private constructor flixibility 
 *   naturally. 
 * - Overhead is really less in this approach, no need to create instance 
 *   by you and no need to make private constructor.
 * - This approach is best for implementing singletong.
 * 
 * Cons:
 * - This approach cant be used if our singleton class suppose to implement
 *   any interface/super class.
 */
public enum ThirdSingletonDemo {

    /**
     * Enum instance. This would be created only once in a life
     */
    INSTANCE {
        public void doSomething() {
            System.out.println("I have nothing to do as of now");
        }
    };

    public abstract void doSomething();
}