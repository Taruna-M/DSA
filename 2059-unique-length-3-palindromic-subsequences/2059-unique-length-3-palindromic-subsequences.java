class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length(), ans = 0;
        char[] str = s.toCharArray();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1); Arrays.fill(last, -1);
        for (int i = 0; i<n; i++){
            int index = str[i]-'a';
            if (first[index]==-1) first[index] = i;
            last[index] = i;
        }
        for (int j=0; j<26; j++){
            if (first[j]!=-1 && last[j]!=-1 && first[j]<last[j]){
                boolean[] visited = new boolean[26];
                for (int k=first[j]+1; k<last[j]; k++){
                    if (!visited[str[k]-'a']) {
                        visited[str[k]-'a'] = true;
                        ans++;
                    }
                }

            }
        }
        return ans;
    }
}

