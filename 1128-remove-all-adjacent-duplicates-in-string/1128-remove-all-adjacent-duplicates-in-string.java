class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        StringBuilder s2 = new StringBuilder();
        while (!stack.isEmpty()) s2.append(stack.pop());
        return s2.reverse().toString();
    }
}