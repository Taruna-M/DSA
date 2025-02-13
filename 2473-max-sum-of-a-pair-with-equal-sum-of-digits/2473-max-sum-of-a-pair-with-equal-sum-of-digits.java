class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            int sum = sumOfDigits(num);
            if (!map.containsKey(sum)) map.put(sum, num);
            else{
                ans = Math.max(ans, map.get(sum) + num);
                map.put(sum, Math.max(map.get(sum), num));
            }
        }
        return ans;
    }
    private int sumOfDigits(int num){
        int n = num;
        int sum = 0;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}


