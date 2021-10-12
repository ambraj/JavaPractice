package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testAddBinary(){
        Assertions.assertEquals("0", solution.addBinary("0", "0"));

        Assertions.assertEquals("10101", solution.addBinary("1010", "1011"));
    }

    @Test
    public void testIsPalindrome(){
        Assertions.assertTrue(solution.isPalindrome(11));

        Assertions.assertTrue(solution.isPalindrome(121));

        Assertions.assertFalse(solution.isPalindrome(123));
    }

    @Test
    public void testMySqrt(){
        Assertions.assertEquals(2, solution.mySqrt(8));
        Assertions.assertEquals(2, solution.mySqrt(4));
        Assertions.assertEquals(3, solution.mySqrt(10));
    }

}