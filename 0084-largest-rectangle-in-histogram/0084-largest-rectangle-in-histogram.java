class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int ans = 0, i, n = heights.length;
        for (i=0;i<n;i++){
            int start = i;
            while(!stack.isEmpty() && heights[i]<stack.peek()[1]){
                int[] pair = stack.pop();
                int index = pair[0];
                int h = pair[1];
                ans = Math.max(ans,h*(i-index));
                start = index;
            }
            stack.push(new int[] {start,heights[i]});
        }

        while (!stack.isEmpty()){
            int[] pair = stack.pop();
            int index = pair[0];
            int h = pair[1];
            ans = Math.max(ans,h*(n-index)); 
        }
        return ans;
    }
}