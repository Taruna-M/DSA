class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int n = s.length(), i = 0, j = 0;
        int ans = 0;
        while (j<n){
            if (!set.contains(arr[j])){
                ans = Math.max(j-i+1, ans);
                set.add(arr[j++]);
            }
            else{
                set.remove(arr[i++]);
            }
        }
        return ans;
    }
}