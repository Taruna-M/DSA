class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, first = 0, second = 0, n = nums.length;
        for (int i = 1; i<n; i++){
            //increasing
            if (nums[i]>nums[i-1]) inc = Math.max(i-first+1, inc);
            else first = i;
            
            //decreasing
            if (nums[i]<nums[i-1]) dec = Math.max(i-second+1, dec);
            else second = i;
        }
        return Math.max(inc, dec);
    }
}