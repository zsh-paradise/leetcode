package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

 示例 1:

 输入: "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 示例 2:

 输入: "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 示例 3:

 输入: "pwwkew"
 输出: 3
 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * Created by zsh_paradise on 2018/11/29.
 * 结题思路    开始的 把数据放到map里，如果出现了重复的，就清空map，然后放新数据，获取map值
 *            然后 同样放一个数据到缓存里，除了重复的然后就在缓存中找，删掉缓存总以前的数据
 *            最后就是一个数组，然后双指针，获取到两个指针的最大值。
 */
public class Test3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0 ;
        }

        String[] str = s.split("");
        int first =0 , end =0 ,temp=0 ;
        for (int i = 0; i <s.length() ; i++) {
            //更新end指针数据
            end = i ;
            for(int j = first ; j < end;++j){
                if(str[j].equals(str[end])){
                    //更新first指针数据
                    first = j+1 ;
                    //当有end 或者first 有一个值发生了变化，那么就更新长度
                    temp = Math.max(temp,end-first+1);

                }
            }
            //当有end 或者first 有一个值发生了变化，那么就更新长度
            temp = Math.max(temp,end-first+1);
        }
        return temp ;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
