package test;

import java.util.Stack;

/**
 * 有效括号
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.
 * Created by zsh_paradise on 2019/1/28.
 */
public class Test20 {
    public static  boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        String[] arr = s.split("");
        Stack<String> bracketsStack = new Stack<String>();
        for(String bracket :arr){
            if(bracketsStack.empty()){
                bracketsStack.push(bracket);
                continue;
            }
            String brackettemp = bracketsStack.peek().toString();
            if(("(".equals(brackettemp)&&")".equals(bracket))||
                    ("[".equals(brackettemp)&&"]".equals(bracket))||
                    ("{".equals(brackettemp)&&"}".equals(bracket))){
                bracketsStack.pop();
            }else {
                bracketsStack.push(bracket);
            }
        }
        return bracketsStack.empty();
    }

    public static void main(String[] args) {
        String s ="()";
        System.out.println(isValid(s));
    }
}
