package corejava.java8examples;

import java.util.Arrays;
import java.util.List;

public class App1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
        System.out.println(numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum()
        );

        Child child = new Child();
        child.method();
    }

}

class Parent {
    public void method() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    @Override
    public void method() throws ArithmeticException {
        System.out.println("child");
    }
}