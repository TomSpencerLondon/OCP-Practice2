package com.tomspencerlondon.streamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

  public static void main(String[] args) {
//    imperativeMyApproach();
//    Lecture1 lecture1 = new Lecture1();
//
//    lecture1.imperativeApproach();

    declarativeApproach();
  }

  private static void declarativeApproach() {
    MockData.getPeople().stream()
        .filter(p -> p.getAge() <= 18)
        .toList()
        .forEach(System.out::println);
  }

  private static void imperativeMyApproach() {
    List<Person> people = MockData.getPeople();

    ArrayList<Person> result = new ArrayList<>();

    int index = 0;
    for (Person person : people) {
//      if (person.getAge() <= 18) {
//        result.add(person);
//      }

      if (index >= 10) {
        break;
      }

      result.add(person);
      index++;
    }

    System.out.println(people);
    System.out.println(result);
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}

class MockData {
  private static List<Person> people = List.of(
      new Person("Tom", 10),
      new Person("Harry", 17),
      new Person("Joe", 23),
      new Person("Will", 15),
      new Person("Mike", 16),
      new Person("Dave", 19),
      new Person("John", 14),
      new Person("Cary", 41),
      new Person("Charlie", 66),
      new Person("Melinda", 18)
      );

  public static List<Person> getPeople() {
    return people;
  }
}

class Lecture1 {
  
  public void imperativeApproach() {
    List<Person> people = MockData.getPeople();

    ArrayList<Person> youngPeople = new ArrayList<>();

    for (Person person : people) {
      if (person.getAge() <= 18) {
        youngPeople.add(person);
      }
    }

    for (Person young : youngPeople) {
      System.out.print(young.getAge() + " ");
    }
  }
}
