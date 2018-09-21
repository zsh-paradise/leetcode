package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zsh_paradise on 2018/9/14.
 */
public class Test217 {
    public boolean containsDuplicate(int[] nums) {
        boolean flag  ;
        Set<Integer> s = new HashSet<Integer>();
        for(int num: nums){
            flag = s.add(num);
            if(false == flag){
                return  false;
            }
        }
        return true ;
    }
}
