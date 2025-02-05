class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int index = -1;
        char ch;
        int notSame = 0;
        for (int i = 0; i<n; i++){
            if (str1[i]!=str2[i]) {
                if (notSame>0){
                    if (str1[index]!=str2[i] || str1[i]!=str2[index]) return false;
                }
                else index = i;
                notSame++;
                if (notSame>2) return false;
            }
        }
        return (notSame == 0 || notSame == 2);
    }
}