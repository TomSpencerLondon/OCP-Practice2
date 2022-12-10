package com.tomspencerlondon.streamsPractice;

public class PersonDto {

  private final String name;
  private final int age;

  public PersonDto(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "PersonDto{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
