class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int n = s.length(), i = 0, j = 0;
        int count = 0;
        int ans = 0;
        while (j<n){
            while (j<n && !set.contains(arr[j])){
                set.add(arr[j]);
                count++;
                ans = Math.max(count, ans);
                j++;
            }
            if (j<n && set.contains(arr[j])){
                i++;
                j=i;
                count = 0;
                set = new HashSet<>();
            }
        }
        return ans;
    }
}