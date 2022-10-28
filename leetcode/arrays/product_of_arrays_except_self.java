class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] forward = new int[len]; forward[len - 1] = 0;
        int[] backward = new int[len]; backward[0] = 0;
        
        int prod = nums[0];
        for (int i = 1; i < len; i++) {
            forward[i] = prod;
            prod = prod * nums[i];
        }
        
        prod = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            backward[i] = prod;
            prod = prod * nums[i];
        }
        
        backward[len - 1] = forward[len - 1];
        
        for (int i = 1; i < len - 1; i++) {
            backward[i] = forward[i] * backward[i];
        }
        
        return backward;
    }
}
