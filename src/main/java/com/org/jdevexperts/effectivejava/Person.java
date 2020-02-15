package com.org.jdevexperts.effectivejava;

/**
 * // TODO Comment
 */
public class Person {

  private final String name;
  private final String surname;
  private final String title;
  private final int    age;


  private  Person(String name, String surname, String title, int age) {
    this.name = name;
    this.surname = surname;
    this.title = title;
    this.age = age;
  }

  public static class Builder {

    private  String name;
    private  String surname;
    private  String title;
    private  int    age;

    private  Builder(String firstName,String lastName) {
      this.name = firstName;
      this.surname = lastName;
    }

    public static Builder of (String firstName,String lastName) {
      return new Builder(firstName,lastName);
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withAge(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this.name,this.surname,this.title,this.age);
    }
}

  public static void main(String[] args) {
    Person person = Builder.of("Sandep", "Pandey").build();
  }
}
