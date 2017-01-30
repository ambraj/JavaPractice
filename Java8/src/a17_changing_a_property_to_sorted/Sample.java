package a17_changing_a_property_to_sorted;

import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
    
    numbers.stream()
           .filter(e -> e % 2 == 0)
           .sorted()
           .forEach(System.out::println);
    //sized, ordered, non-distinct, sorted
  }
}