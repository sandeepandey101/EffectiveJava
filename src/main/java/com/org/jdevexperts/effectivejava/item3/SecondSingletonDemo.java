package com.org.jdevexperts.effectivejava.item3;

/**
 * This method uses private constructor with combination of static factory method to
 * achieve singleton property.
 * 
 * Pros:
 * -----
 * 1: This method gives us flexibility to offer instances based upon the client type.
 *    We can maintain precomputed pool of object for different client and we can serve
 *    them accordingly.
 * 
 * 2: This method also provide flixibility to change this class not to be singleton
 *    even without changing api becuase client is depend only upon static factory method.
 * 
 * 3: This method also lets client define instance of this methos as supplier via method reference.
 * 
 * Cons:
 * 1: This method does not provider enough information to the client whether this is singletong or
 * not.
 * 
 * 2: This kind of implementation wont be able to maintain singleton property if we are going to 
 * searlize/desealize this class.
 * 
 * Fix: To fix searlization problem , define every field as transient and offer a read resolve method who
 * would be returning the singletong instance only.
 * 
 * 
 */
public class SecondSingletonDemo {

    // Private internal instance, created ocne throughout the life.
    private static final SecondSingletonDemo INSTANCE = new SecondSingletonDemo();

    // Private constructor
    // clients are not allowed to apply new operator here
    private SecondSingletonDemo() {

    }

    // Static factory method exposed to the clients to recieve the singleton
    // instance.
    public static SecondSingletonDemo getInstance() {
        return INSTANCE;
    }

    private static class Client {
        private java.util.function.Supplier<SecondSingletonDemo> Supplier=  SecondSingletonDemo::getInstance
;    }
}

