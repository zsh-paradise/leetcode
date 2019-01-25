package test;

/**
 * Created by zsh_paradise on 2018/9/13.
 */
public class Test189 {
    public static int[] rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] result = new  int[nums.length];

        for (int i = 0; i <nums.length ; i++) {
            result[(i+k)%nums.length] = nums[i];
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
    }
}
