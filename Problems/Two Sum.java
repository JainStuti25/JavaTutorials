//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[] {i, j};
                }
            }
        }
        
        return result;
    }
}
