class Solution {
    public int countServers(int[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==1) {
                    row[i]++; 
                    col[j]++;
                }
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==1) {
                    if (row[i]>1 || col[j]>1) ans++;
                }
            }
        }
        return ans;
    }
}