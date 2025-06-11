class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length(), i = 0, j = 0;
        int ans = 0;
        while (j<n){
            if (!set.contains(s.charAt(j))){
                ans = Math.max(j-i+1, ans);
                set.add(s.charAt(j++));
            }
            else set.remove(s.charAt(i++));
        }
        return ans;
    }
}