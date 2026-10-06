class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer>stack=new Stack<>();
        int c1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(0);
                c1++;
            }else if(!stack.isEmpty() && ch==')'){
                stack.pop();
                c1--;
            }
            else if(stack.isEmpty() && ch==')'){
                c1++;
            }
            else{
                stack.pop();
                c1--;
            }
        }
        // if(stack.isEmpty()){
        //     return 0;
        // }else{
        //     return c1;
        // }
        return c1;
    }
}