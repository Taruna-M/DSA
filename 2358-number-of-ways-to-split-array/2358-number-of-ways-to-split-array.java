class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0, n = nums.length;
        long total = 0, checkSum = 0;
        for (int num: nums) total+=num;
        for (int i=0; i<n-1; i++){
            checkSum+=nums[i];
            long remaining = total - checkSum;
            if (checkSum >= remaining) ans++;
        }
        return ans;
    }
}