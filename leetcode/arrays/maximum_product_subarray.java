class Solution {
    public int maxSubArray(int[] nums) {
        return kadane(nums);
    }
    
    public int kadane(int[] nums) {
        int curMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            max = Math.max(curMax, max);
        }
        return max;
    }
}
