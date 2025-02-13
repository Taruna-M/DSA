class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1, n = nums.length;
        int[] sums = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0; i<n; i++){
            sums[i] = sumOfDigits(nums[i]);
        }
        for (int i=0; i<n; i++){
            map.putIfAbsent(sums[i], new ArrayList<Integer>());
            map.get(sums[i]).add(nums[i]);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> index = entry.getValue();
            if (index.size()>1){
            Collections.sort(index);
            int sum = 0;
            sum+=index.get(index.size()-1)+index.get(index.size()-2);
            ans = Math.max(sum,ans);
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


