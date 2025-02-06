class Solution {
    public int tupleSameProduct(int[] nums) {
        //(a,b,c,d) for a*b = c*d 8 ways
        //both a,b cannot be larger / smaller than both c,d
        int n = nums.length, ans = 0;;
        Arrays.sort(nums);
        for (int i = 0; i<n; i++){
            int a = nums[i];
            for (int j = n-1; j>i; j--){
                int b = nums[j];
                int ab = a*b;
                Set<Integer> set = new HashSet<>();
                for (int k = i+1; k<j; k++){
                    int c = nums[k];
                    if (ab%c == 0){
                        int d = ab/c;
                        if (set.contains(d)) ans+=8;
                        set.add(c);
                    }
                    
                }
            }
        }
        return ans;
    }
}