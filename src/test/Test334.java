package test;

/**
 * Created by zsh_paradise on 2019/2/13.
 * 递增的三元子序列
 *
 * 思路不对。。
 *
 * 指针不行，贪心不行。又要要求时间是n 空间是1
 *
 * 这个题最难的其实是这个 >= 号 ，这个更新符号想不通就很难，
 * 如果后面的后一个数据不能大于前一个数，就会一直更新i和j
 * 当i和j 都满足，且还有第三个的时候就说明这个数据满足。
 */
public class Test334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <3 ){
            return false ;
        }
        int i =Integer.MAX_VALUE ,j = Integer.MAX_VALUE;
        for (int num :nums){
            if(i>=num){
                i = num;
            }else if(j>=num){
                j =num;
            }else {
                return true ;
            }
        }

        return  false ;
    }
}
