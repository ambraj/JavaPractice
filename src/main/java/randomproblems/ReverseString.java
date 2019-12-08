package randomproblems;

import java.util.Stack;

public class ReverseString {
    // 1. using reverse method of String Builder
    // 2. using Collections.reverse() method of list

    // 3. using stack
    public static String reverse2(String str){
        if(str == null || str.equals(""))
            return str;

        char[] arrChar = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char c : arrChar){
            stack.push(c);
        }
        int i = 0;
        while(!stack.isEmpty()){
            arrChar[i++] = stack.pop();
        }
        return String.valueOf(arrChar);
    }

    // 4. using character array

    // 5. using char array and swapping

    // 6. using string concatenation

    // 7.  using unicode right-to-left override (RLO) character

    // 8. using byte array

    // 9. using recursion

    // 10. using substring method

    public static void main(String[] args) {
        String str = "ambuj rajput";
        System.out.println(reverse2(str));
    }
}
