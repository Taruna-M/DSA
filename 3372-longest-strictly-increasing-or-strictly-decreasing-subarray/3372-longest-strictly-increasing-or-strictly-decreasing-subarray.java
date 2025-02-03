class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, n = nums.length, i = 0, j = 0;
        //increasing
        while(i<n && j<n-1){
            int curr = 1;
            while(j<n-1 && nums[j+1]>nums[j]) {
                curr++;
                j++;
            }
            j++;
            inc = Math.max(inc, curr);
            i = j;
            j = i;
        }
        //decreasing
        i = 0; j = 0;
        while(i<n && j<n-1){
            int curr = 1;
            while(j<n-1 && nums[j+1]<nums[j]) {
                curr++;
                j++;
            }
            j++;
            dec = Math.max(dec, curr);
            i = j;
            j = i;
        }

        return Math.max(inc, dec);
    }
}