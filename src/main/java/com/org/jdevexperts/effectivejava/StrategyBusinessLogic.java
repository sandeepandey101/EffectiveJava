package com.org.jdevexperts.effectivejava;

import com.google.common.base.Preconditions;

import java.util.function.IntUnaryOperator;

/**
 * // TODO Comment
 */
public class StrategyBusinessLogic {

  private final IntUnaryOperator operator;

  private StrategyBusinessLogic(IntUnaryOperator operator) {
    this.operator = operator;
  }

  public static StrategyBusinessLogic of(IntUnaryOperator operator) {
    Preconditions.checkNotNull(operator);
    return new StrategyBusinessLogic(operator);
  }

  public void compute() {
    System.out.println("x");
    System.out.println("y");
    System.out.println("z");
    System.out.println(operator.applyAsInt(5));
    System.out.println("a");
    System.out.println("b");
    System.out.println("c");

  }

  public static void main(String[] args) {
    StrategyBusinessLogic.of(i -> i/2).compute();  ;
    StrategyBusinessLogic.of(i -> i * 4).compute();  ;
  }


  
}
