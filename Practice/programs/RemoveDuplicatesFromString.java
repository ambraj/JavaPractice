package Practice.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String str = "janta";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder reversedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (!set.contains(character)) {
                set.add(character);
                reversedStr.append(character);
            }
        }

        return reversedStr.toString();
    }

}
