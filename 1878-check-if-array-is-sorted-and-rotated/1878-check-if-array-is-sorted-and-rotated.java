class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i=0; i<n; i++){
            int index2 = (i+1)%n;
            if (nums[i]>nums[index2]) count++;
            if (count>1) return false;
        }
        return true;
    }
}