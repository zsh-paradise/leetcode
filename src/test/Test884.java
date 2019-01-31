package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by zsh_paradise on 2018/9/5.
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）

 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。

 返回所有不常用单词的列表。

 您可以按任何顺序返回列表。

 示例 1：

 输入：A = "this apple is sweet", B = "this apple is sour"
 输出：["sweet","sour"]
 示例 2：

 输入：A = "apple apple", B = "banana"
 输出：["banana"]

 提示：

 0 <= A.length <= 200
 0 <= B.length <= 200
 A 和 B 都只包含空格和小写字母。
 */
public   class Test884 {
    //自己写的麻烦方法
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>(64);
        StringBuffer sb = new StringBuffer();
        String[] stringsA = A.split(" ");
        String[] stringsB = B.split(" ");
        for (int i = 0; i <stringsA.length ; i++) {
            if (!map.containsKey(stringsA[i])){
                map.put(stringsA[i],1);
            }else{
                map.put(stringsA[i],map.get(stringsA[i])+1);
            }

        }

        for (int i = 0; i <stringsB.length ; i++) {
            if (!map.containsKey(stringsB[i])){
                map.put(stringsB[i],1);
            }else{
                map.put(stringsB[i],map.get(stringsB[i])+1);
            }
        }
        for (Map.Entry<String,Integer> entry  :map.entrySet()){
            if( 1 == entry.getValue() ){
                sb.append(entry.getKey()).append(" ");
            }
        }
        if(sb.toString().length()>0){
            return sb.toString().split(" ");
        }else{
            return new String[0] ;
        }

    }
    //标准答案
    public static String[] uncommonFromSentences1(String A, String B) {
        Map<String,Integer> map = new HashMap<>(64);
        for(String stringA:A.split(" ")){
            map.put(stringA,map.getOrDefault(stringA,0)+1);
        }
        for (String stringB:B.split(" ")){
            map.put(stringB,map.getOrDefault(stringB,0)+1);
        }
        List<String> ans = new LinkedList();
        for(String word :map.keySet()){
            if(map.get(word) ==1 ){
                ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);


    }


}
