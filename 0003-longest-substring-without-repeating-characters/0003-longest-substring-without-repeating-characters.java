class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length(), i = 0;
        int ans = 0;
        for (int j=0; j<n; j++){
            while (j<n && set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            ans = Math.max(j-i+1, ans);
            set.add(s.charAt(j));
        }
        return ans;
    }
}