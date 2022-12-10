package com.tomspencerlondon.streamcourse.lectures;

import com.google.common.collect.ImmutableList;
import com.tomspencerlondon.streamcourse.beans.Car;
import com.tomspencerlondon.streamcourse.beans.Person;
import com.tomspencerlondon.streamcourse.beans.PersonDTO;
import com.tomspencerlondon.streamcourse.mockdata.MockData;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();

    final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;

    List<Car> carsFiltered = cars.stream().filter(carPredicate).toList();

    carsFiltered.forEach(System.out::println);
    System.out.println(carsFiltered.size());
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();

    List<PersonDTO> dtos = people.stream()
        .map(PersonDTO::map)
        .collect(Collectors.toList());

    dtos.forEach(System.out::println);

    assertThat(dtos).hasSize(1000);
    System.out.println(dtos.size());

  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    double average = MockData.getCars()
        .stream()
        .mapToDouble(Car::getPrice)
        .average()
        .orElse(0);
    System.out.println(average);
  }

  @Test
  public void test() throws Exception {
    MockData.getCars().forEach(System.out::println);
  }
}



