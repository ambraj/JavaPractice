package practice;

import java.util.function.Function;

public class App {

    public static void main(String[] args) {

        int result = incrementByOne.andThen(multiplyByTen).apply(1);
        System.out.println(result);

    }

    static Function<Integer, Integer> incrementByOne = number -> number++;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

}
