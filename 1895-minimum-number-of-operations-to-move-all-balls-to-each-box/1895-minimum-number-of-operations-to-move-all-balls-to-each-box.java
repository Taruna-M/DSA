class Solution {
    public int[] minOperations(String boxes) {
        char[] box = boxes.toCharArray();
        int n = box.length;
        List<Integer> ones = new ArrayList<>();
        int[] ans = new int[n];
        for (int i=0; i<n; i++){
            if (box[i]=='1') ones.add(i);
        }
        for (int j=0; j<n; j++){
            for (int index: ones){
                ans[j]+=Math.abs(index-j);
            }
        }
        return ans;
    }
}