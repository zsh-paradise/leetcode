/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:从标准答案中可以看到，这个相同字段都是从第一个字段开始，
      如果第一个字段不同了，后面也不会有相同的。

 所有输
 * Created by zsh_paradise on 2018/10/10.
 */
public class Test14 {
    public String longestCommonPrefix(String[] strs) {
        int index = 0 ;
        if(strs.length ==0 ){
            return "";
        }

        for(int i =0 ; i <strs[0].length();i++){
            char current = strs[0].charAt(i);
            for(String str : strs){
                if (str.length() == i || current != str.indexOf(index)) {
                    return  str.substring(0,index);
                }
            }
            index ++;
        }
        return strs[0].substring(0,index);
    }
}
