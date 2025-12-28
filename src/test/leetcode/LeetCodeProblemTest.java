package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeProblemTest {

    @Test
    void checkInclusion() {
        LeetCodeProblem leetCodeProblem = new LeetCodeProblem();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = leetCodeProblem.checkInclusion(s1, s2);
        assertTrue(result);
    }

    @Test
    void checkInclusion2() {
        LeetCodeProblem leetCodeProblem = new LeetCodeProblem();
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean result = leetCodeProblem.checkInclusion(s1, s2);
        assertFalse(result);
    }

}