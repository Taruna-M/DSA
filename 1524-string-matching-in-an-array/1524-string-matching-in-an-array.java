class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        for (int i=0; i<n-1; i++){
            int j = i+1;
            while (j<n && !words[j].contains(words[i])) j++;
            if (j<n && words[j].contains(words[i])) ans.add(words[i]);
        }
        return ans;
    }
}
