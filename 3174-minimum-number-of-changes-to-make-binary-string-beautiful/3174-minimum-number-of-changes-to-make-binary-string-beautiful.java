class Solution {
    public int minChanges(String s) {
        int change = 0, n = s.length(), i=0;
        char[] a = s.toCharArray();
        for (i=0;i<n;i+=2){
            if (a[i]!=a[i+1]) change++;
        }
        return change;
    }
}