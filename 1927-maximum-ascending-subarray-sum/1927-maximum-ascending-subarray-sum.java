class Solution {
    public int maxAscendingSum(int[] nums) {
        int start = 0, n = nums.length, max = nums[0], sum = nums[0];
        for (int i = 1; i<n; i++){
            if (nums[i]>nums[i-1]) sum+=nums[i];
            else sum = nums[i];
            max = Math.max(max, sum);
        }
        return Math.max(max, sum);
    }
}