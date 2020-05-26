package com.org.jdevexperts.effectivejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * // TODO Comment
 */
public class StringJoining {


  public static void main(String[] args) {
      upperCaseAndCommaSeperated();
  }
  public static void  upperCaseAndCommaSeperated() {
    List<String> name = Arrays.asList("Tim","Dennis","Shawn");
    System.out.println(name.stream().map(String::toUpperCase).collect(Collectors.joining(",")));

  }
}
