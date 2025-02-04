class Solution {
    public int maxAscendingSum(int[] nums) {
        int start = 0, i = 1, n = nums.length, max = nums[0], sum = nums[0];
        while (i<n){
            while (i<n && nums[i]>nums[i-1]) sum+=nums[i++];
            max = Math.max(max, sum);
            if (i<n) sum = nums[i];
            i++;
        }
        return max;
    }
}