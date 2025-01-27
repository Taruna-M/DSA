class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        boolean[][] check = new boolean[numCourses][numCourses];
        for (int[] list: prerequisites){
            int key = list[0];
            int val = list[1];
            check[key][val] = true;
        }
        for (int i=0; i<numCourses; i++){
            for (int j=0; j<numCourses; j++){
                for (int k=0; k<numCourses; k++){
                    if (check[j][i] && check[i][k]) check[j][k] = true;
                }
            }
        }
        for (int[] list: queries){
            int key = list[0];
            int val = list[1];
            if (check[key][val]) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}