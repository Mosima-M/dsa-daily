package dsa;

import java.util.HashMap;
import java.util.Map;

public class Arrays {
    // Question 1 — Two Sum
    // Given an array of integers and a target, return the indices of the
    // two numbers that add up to target.
    public static int[] twoSum(int[] nums, int target) {

        // TODO: implement
        for(int i = 0; i < nums.length; i++){
            for(int y = i +1; y < nums.length; y++){
                if(nums[i] + nums[y] == target){
                    return new int[]{i,y};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumHashMap(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    // Question 2 — Best Time to Buy and Sell Stock
    // prices[i] is the price on day i. Return the maximum profit from
    // buying on one day and selling on a later day. Return 0 if no
    // profit is possible. One pass, O(n).
    public static int maxProfit(int[] prices) {

        // TODO: implement
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    // Question 4 — Product of Array Except Self
    // Return an array where output[i] is the product of every element
    // except nums[i]. You may NOT use division.
    public static int[] productExceptSelf(int[] nums) {

        // TODO: implement

        return null;
    }
}
