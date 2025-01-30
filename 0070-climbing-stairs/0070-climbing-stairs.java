class Solution {
    public int climbStairs(int n) {
        //fibonacci
        int a = 1, b = 1;
        if (n==1) return a;
        int ans = 0;
        for (int i=0; i<n-1; i++){
            ans=(a+b);
            a=b;
            b=ans;
        }
        return ans;
    }
}
