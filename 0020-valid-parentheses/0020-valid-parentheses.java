class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');map.put('{','}');map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if (map.containsKey(current)){
                stack.push(current);
            }
            else if (stack.isEmpty()) return false;
            else{
                char top=stack.peek();
                if (map.get(top)==current) stack.pop();
                else return false;
            }
            
        }
        
        return stack.isEmpty();
    }
}