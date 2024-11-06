class Solution {
    public String compressedString(String word) {
        char[] w = word.toCharArray();
        StringBuilder comp = new StringBuilder();
        int n = w.length, index=0, i=0;
        while(i<n){
            int count = i+1;
            while (count<n && count-i<9 && w[count]==w[i]) count++;
            comp.append(Integer.toString(count-i));
            comp.append(w[i]);
            i=count;
        }
        return comp.toString();
    }
}