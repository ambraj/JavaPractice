package com.luv2code;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {

        Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> optionalValue1 = Optional.ofNullable(value1);
        Optional<Integer> optionalValue2 = Optional.ofNullable(value2);

        Integer sum = optionalValue1.orElse(0) + optionalValue2.orElse(0);

        System.out.println("sum = " + sum);

    }
}
