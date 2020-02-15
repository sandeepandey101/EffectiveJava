package com.org.jdevexperts.effectivejava;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * // TODO Comment
 */
public enum OperationInJava8Way {

  ADD(Integer::sum, "A"),
  SUBTRACT((first, second) -> (first - second), "B"),
  DIVIDE((first, second) -> (first / second), "C"),
  MULTIPLY((first, second) -> (first * second), "D");


  private static final Map<String, OperationInJava8Way> VALUE_MAP =
      Stream.of(values()).collect(Collectors.toMap(i -> i.databaseValue, i -> i));
  private BinaryOperator<Integer> binaryOperator;
  private String databaseValue;

  OperationInJava8Way(BinaryOperator<Integer> binaryOperator, String databaseValue) {
    this.binaryOperator = binaryOperator;
    this.databaseValue = databaseValue;
  }

  public OperationInJava8Way fromString(String databaseValue) {
    return VALUE_MAP.getOrDefault(databaseValue, OperationInJava8Way.ADD);
  }

  public String toDatabaseValue() {
    return this.databaseValue;
  }

}
