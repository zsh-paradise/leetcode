package test;

import java.util.*;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

 案例:

 s = "leetcode"
 返回 0.

 s = "loveleetcode",
 返回 2.

 * Created by zsh_paradise on 2018/10/9.
 */
public class Test387 {
    public int firstUniqChar(String s) {
       Map<String,Integer> map = new LinkedHashMap<>(16);
       String[] arr = s.split("");
        for (int i = 0; i <arr.length ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else {
                map.put(arr[i],-1);
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() != -1){
                return entry.getValue();
            }
        }
        return  -1 ;
    }
}
