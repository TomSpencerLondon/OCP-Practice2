package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortingPractice {

  public static void main(String[] args) {
    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @apiNote
     * It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * @param   o the object to be compared.
     * @return  a negative integer, zero, or a positive integer as this object
     *          is less than, equal to, or greater than the specified object.
     *
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException if the specified object's type prevents it
     *         from being compared to this object.
     */
//    public int compareTo(T o);

    System.out.println("--- sort -");
    List<String> stringsA = Arrays.asList("anna", "cat", "rat", "bat","mat","hat","vat","brat");
    stringsA.stream().sorted().forEach(System.out::println);

    System.out.println("--- filter and sort -");
    stringsA.stream().filter(e -> e.startsWith("a")).sorted().forEach(System.out::println);

    System.out.println("--- random and sort -");
    Random random2 = new Random();
    random2.ints().limit(10).sorted().forEach(System.out::println);

  }

}
