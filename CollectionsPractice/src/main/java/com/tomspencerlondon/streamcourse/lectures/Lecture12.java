package com.tomspencerlondon.streamcourse.lectures;

import com.tomspencerlondon.streamcourse.beans.Person;
import com.tomspencerlondon.streamcourse.mockdata.MockData;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            ArrayList::new,
            ArrayList::add,
            (list1, list2) -> list1.addAll(list2));
//        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
