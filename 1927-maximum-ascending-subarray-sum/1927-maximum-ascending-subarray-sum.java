class Solution {
    public int maxAscendingSum(int[] nums) {
        int start = 0, n = nums.length, max = 0, sum = nums[0];
        for (int i = 1; i<n; i++){
            if (nums[i]>nums[i-1]) sum+=nums[i];
            max = Math.max(max, sum);
            if (nums[i]<=nums[i-1]) sum = nums[i];
        }
        return Math.max(max, sum);
    }
}