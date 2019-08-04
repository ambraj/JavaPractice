package corejava.java8examples.a10_toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

        //double the even values and put that into a list.

        Set<Integer> doubleOfEven2 =
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .collect(toSet());
        System.out.println(doubleOfEven2);
    }
}