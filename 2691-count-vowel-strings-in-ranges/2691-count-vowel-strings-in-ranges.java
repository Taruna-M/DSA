class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Character> vowel = new ArrayList<>();
        vowel.add('a'); vowel.add('e'); vowel.add('i'); vowel.add('o'); vowel.add('u');
        int[] vowelSum = new int[words.length];
        int[] ans = new int[queries.length];
        int index = 0;
        if (startEndVowel(words[0], vowel)) vowelSum[0] = 1;
        for (int i=1; i<words.length; i++){
            vowelSum[i] = vowelSum[i-1];
            if (startEndVowel(words[i], vowel)) vowelSum[i]+=1;
        }
        for (int[] range: queries){
            if (range[0]==0) ans[index++] = vowelSum[range[1]];
            else ans[index++] = vowelSum[range[1]] - vowelSum[range[0]-1];
        }
        return ans;
    }
    public boolean startEndVowel(String str, List<Character> vowel){
        int n = str.length();
        return (vowel.contains(str.charAt(0)) && vowel.contains(str.charAt(n-1)));
    }
}