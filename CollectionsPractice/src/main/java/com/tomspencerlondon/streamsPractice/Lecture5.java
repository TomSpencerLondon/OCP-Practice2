package com.tomspencerlondon.streamsPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture5 {
  public static void main(String[] args) {
//    filterPractice();
    System.out.println(firstMapping());
  }

  public static List<PersonDto> firstMapping() {
    return MockData.getPeople()
        .stream()
        .map(p -> new PersonDto(p.getName(), p.getAge()))
        .collect(Collectors.toList());
  }

  private static void filterPractice() {
    List<Car> cars = MockData5.getCars();

    List<Car> filteredCars = cars.stream()
        .filter(car -> car.getPrice() < 2000)
        .toList();

    filteredCars.forEach(System.out::println);
    System.out.println(filteredCars.size());
  }

}

class Car {
  private int price;

  public Car(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}

class MockData5 {

  private static List<Car> cars = List.of(
      new Car(1000),
      new Car(500),
      new Car(800));

  public static List<Car> getCars() {
    return cars;
  }
}
