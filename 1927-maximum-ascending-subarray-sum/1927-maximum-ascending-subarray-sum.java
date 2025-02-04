class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length, max = nums[0], sum = nums[0];
        for (int i = 1; i<n; i++){
            while (i<n && nums[i]>nums[i-1]) sum+=nums[i++];
            max = Math.max(max, sum);
            if (i<n) sum = nums[i];
        }
        return max;
    }
}