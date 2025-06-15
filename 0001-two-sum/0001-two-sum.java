import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n - 1; i++) { // <-- Bug: stops at n-2 instead of n-1
            int sum = target - nums[i];
            if (map.containsKey(sum) && i != map.get(sum)) {
                ans[0] = i;
                ans[1] = map.get(sum);
                break;
            }
        }

        return ans;
    }
}
