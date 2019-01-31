package test;

import java.util.*;

/**
 * Created by zsh_paradise on 2019/1/30.
 */
public class TestGroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length ; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            list.add(String.valueOf(str));
        }

        for (int i = 0; i <list.size() ; i++) {
            if(map.containsKey(i)){
                continue;
            }
            List<String> listStr = new ArrayList<>();
            for(int j =i+1; j<list.size();j++){
                if(list.get(i).equals(list.get(j))){


                    if(!map.containsKey(i)){
                        listStr.add(strs[i]);
                        map.put(i,1);
                    }
                    if(!map.containsKey(j)){
                        listStr.add(strs[j]);
                        map.put(j,1);
                    }


                }
            }
            result.add(listStr);
        }

        return  result;

    }


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists= groupAnagrams(arr);
        System.out.println("111111111");
    }
}
