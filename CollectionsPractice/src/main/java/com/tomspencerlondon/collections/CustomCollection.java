package com.tomspencerlondon.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class CustomCollection {

  public static void main(String[] args) {
    List<String> myArray = asList(new String[]{"a", "b", "c", "d"});
    System.out.println(myArray);

    myArray.set(1, "B");

    System.out.println(myArray);
  }

  public static <T> List<T> asList(T[] a) {
    return new MyArrayList<T>(a);
  }

  private static class MyArrayList<T> extends AbstractList<T> {

    private final T[] a;

    MyArrayList(T[] array) {
      a = array;
    }

    @Override
    public T get(int index) {
      return a[index];
    }

    public T set(int index, T element) {
      T oldValue = a[index];
      a[index] = element;
      return oldValue;
    }

    @Override
    public int size() {
      return a.length;
    }
  }
}
