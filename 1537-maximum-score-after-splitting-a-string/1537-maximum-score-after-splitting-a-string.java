class Solution {
    public int maxScore(String s) {
        int ans = 0, n = s.length();
        char[] arr = s.toCharArray();
        int[] zero = new int[n], one = new int[n];
        if (arr[0]=='0') zero[0] = 1;
        else one[0] = 1;
        for (int i=1; i<n; i++){
            zero[i] = zero[i-1];
            one[i] = one[i-1];
            if (arr[i]=='0') zero[i]+=1;
            else one[i]+=1;
        }
        for (int i=0; i<n-1; i++){
            int zeroes = zero[i], ones = one[n-1]-one[i];
            int current = zeroes + ones;
            if (current>ans) ans = current;
        }
        return ans;
    }
}
