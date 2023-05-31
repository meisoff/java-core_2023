package timus.ex6;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c  == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                int top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
