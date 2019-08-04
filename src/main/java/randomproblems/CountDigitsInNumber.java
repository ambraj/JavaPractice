package randomproblems;

import java.util.HashMap;
import java.util.Map;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        int num = 15899854;
        Map<Integer, Integer> map = new HashMap<>();

        while (num > 0) {
            int digit = num % 10;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                map.put(digit, 1);
            }
            num /= 10;
        }
        System.out.println(map);

        ///////////////////////////////////

        String str = "ambuj rajput";
        char[] chars = str.toCharArray();

        System.out.println(new String(chars));
    }
}
