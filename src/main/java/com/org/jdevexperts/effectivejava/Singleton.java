package com.org.jdevexperts.effectivejava;

/**
 * This kind of singleton is not good when object is supposed to implement Searilizable interface.
 * This will create new object on desearilize . so this is not perferable
 */
public class Singleton {

  private static final Singleton INSTANCE = new Singleton();
}
