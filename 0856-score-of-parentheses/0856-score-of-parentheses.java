class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(0);
            }else{
                int value=stack.pop();
                if(value==0){
                    value=1;
                }else{
                    value=value*2;
                }
                int prev=stack.pop();
                stack.push(prev+value);
            }
        }
        return stack.pop();
    }
}