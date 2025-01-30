class Solution {
    public int trap(int[] height) {
        int n = height.length, ans = 0;
        if (n==0) return ans;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();  
                if (stack.isEmpty()) break; 
                int width = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                ans+=width*boundedHeight;
            }
            stack.push(i);
        }
        
        return ans;
    }
}