package test;

import java.util.*;

/**
 * Created by zsh_paradise on 2018/9/11.
 */
public class TestSet {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int num : nums1){
            ans.add(num);
        }
        for(int num : nums2){
            res.add(num);
            if(!ans.contains(num)){
                res.remove(num);
            }
        }
        int[] result = new int[res.size()];
        int i = 0 ;
        Iterator it  = res.iterator();
        while(it.hasNext()){
            result[i]= (int) it.next();
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 ={1,2,2,1};
        int[] arr2 = {2,2};
        int[] res = intersection(arr1,arr2);
        System.out.println(res);
    }
}

