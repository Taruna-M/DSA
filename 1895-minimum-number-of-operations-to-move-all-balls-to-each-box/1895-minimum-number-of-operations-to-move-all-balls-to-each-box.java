class Solution {
    public int[] minOperations(String boxes) {
        char[] box = boxes.toCharArray();
        int n = box.length;
        int[] ans = new int[n], left = new int[n], right = new int[n];
        int balls = 0;
        for (int i=1; i<n; i++){
            if (box[i-1]=='1') balls+=1;
            left[i]=left[i-1] + balls;
        }
        balls = 0;
        for (int i=n-2; i>=0; i--){
            if (box[i+1]=='1') balls+=1;
            right[i]=right[i+1] + balls;
        }
        for (int i=0; i<n; i++){
            ans[i]=left[i]+right[i];
        }
        return ans;
    }
}