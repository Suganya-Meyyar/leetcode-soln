class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();

        for(int i=0;i<len;i++){
            

            char ch = s.charAt(i);
            
            
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else
            stack.push(ch);
        }
        StringBuilder str = new StringBuilder();
        for(char c : stack){
            str.append(c);
        }
        return str.toString();
    }
}