class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1, n = nums.length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num: nums){
            int sum = sumOfDigits(num);
            map.putIfAbsent(sum, new PriorityQueue<>(Collections.reverseOrder()));
            map.get(sum).add(num);
        }
        for (PriorityQueue<Integer> heap : map.values()) {
            if (heap.size()>1) ans = Math.max(ans,heap.poll()+heap.poll());
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


