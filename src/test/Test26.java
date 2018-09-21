package test;

/**
 * Created by zsh_paradise on 2018/9/13.
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

 示例 1:

 给定数组 nums = [1,1,2],

 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

 你不需要考虑数组中超出新长度后面的元素。
 示例 2:

 给定 nums = [0,0,1,1,1,2,2,3,3,4],

 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 你不需要考虑数组中超出新长度后面的元素。

 算法

 数组完成排序后，我们可以放置两个指针 ii 和 jj，其中 ii 是慢指针，而 jj 是快指针。
 只要 nums[i] = nums[j]nums[i]=nums[j]，我们就增加 jj 以跳过重复项。
 当我们遇到 nums[j] \neq nums[i]nums[j]̸=nums[i] 时，跳过重复项的运行已经结束，
 因此我们必须把它（nums[j]nums[j]）的值复制到 nums[i + 1]nums[i+1]。
 然后递增 ii，接着我们将再次重复相同的过程，直到 jj 到达数组的末尾为止。

 */
public class Test26  {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) {
            return 0;
        }
        int j = 0 ;
        for(int i = 1 ; i<nums.length;i++ ){
            if(nums[i] != nums[j]){
                j++;
                nums[j]=nums[i] ;
            }
        }
        return j+1 ;
    }
}
