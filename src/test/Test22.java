package test;

import java.util.ArrayList;
import java.util.List;

/**括号生成
 * Created by zsh_paradise on 2019/2/25.
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

 例如，给出 n = 3，生成结果为：

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class Test22 {
    public List<String> generateParenthesis(int n) {
        int rightNum = n ;
        int leftNum = n ;
        List<String> result = new ArrayList<String>();
        parentheses("",leftNum,rightNum,result);
        return  result ;

    }

    public void parentheses(String s , int leftNum ,int rightNum ,List<String> result){
        if(leftNum==0 && rightNum ==0){
            result.add(s);
        }
        if(rightNum > leftNum){
            parentheses(s+")",leftNum,rightNum-1,result);
        }
        if(leftNum>0){
            parentheses(s+"(",leftNum-1,rightNum,result);
        }
    }
}
