class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int n = s.length(), i = 0, j = 0;
        int ans = 0;
        while (j<n){
            while (j<n && !set.contains(arr[j])){
                set.add(arr[j]);
                ans = Math.max(j-i+1, ans);
                j++;
            }
            if (j<n && set.contains(arr[j])){
                set.remove(arr[i]);
                i++;
            }
        }
        return ans;
    }
}