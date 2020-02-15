package com.org.jdevexperts.effectivejava;

/**
 * // TODO Comment
 */
public  abstract class TemplateBusinessLogic {

  public void compute() {
    System.out.println("x");
    System.out.println("y");
    System.out.println("z");
    doSomething();
    System.out.println("a");
    System.out.println("b");
    System.out.println("c");

  }


  protected abstract void doSomething();
}
