package corejava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantApp {

    private static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 800, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
    );

    public static void main(String[] args) {

//        menu.stream()
//                .filter(c -> c.getCalories() <= 350)
//                .map(Dish::getName)
//                .forEach(System.out::println);

//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(3, 4);
//
//        System.out.println(list1.stream()
//                .flatMap(num1 -> list2.stream()
//                        .filter(num2 -> (num1 + num2) % 3 == 0)
//                        .map(num2 -> Arrays.asList(num1, num2)))
//                .collect(Collectors.toList()));

    }

}
