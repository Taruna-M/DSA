class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1, n = nums.length;
        int[] sums = new int[n];
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i=0; i<n; i++){
            sums[i] = sumOfDigits(nums[i]);
        }
        for (int i=0; i<n; i++){
            map.putIfAbsent(sums[i], new PriorityQueue<>(Collections.reverseOrder()));
            map.get(sums[i]).add(nums[i]);
        }
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            PriorityQueue<Integer> index = entry.getValue();
            if (index.size()>1){
                int sum = 0;
                sum+=index.poll()+index.poll();
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


