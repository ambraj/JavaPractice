package leetcode;

import java.util.Arrays;

public class LeetCodeProblem {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];


                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
