class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        Arrays.sort(words, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (!ans.contains(words[j])){
                    if (words[i].indexOf(words[j])!=-1) ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}
