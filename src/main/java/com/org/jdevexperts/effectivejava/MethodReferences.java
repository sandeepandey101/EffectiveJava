package com.org.jdevexperts.effectivejava;

import java.time.Instant;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author sandeepandey
 */
public class MethodReferences {

  public static void st(Function<String, Integer> function) {


  }

  public static void bound(Predicate<Instant> predicate) {

  }

  public static void unbound(UnaryOperator<String> operator) {

  }

  public static void array(int[] array) {

  }

  public static MethodReferences of() {

    return new MethodReferences();
  }

  private MethodReferences() {

  }
}
