package test;

/**
 * Created by zsh_paradise on 2019/4/10.
 */
public class Test34 {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchFirst(nums,0,nums.length-1,target),
                            searchEnd(nums,0,nums.length-1,target)};
    }

    private int searchFirst(int[] nums, int low , int high , int target){
        if(low > high){
            return -1;
        }
        if(nums[low]==target){
            return low ;
        }

        int mid = (low+high)/2;
        if(nums[low]< target && target<=nums[mid]){
            return searchFirst(nums,low+1,mid,target);
        }else{
            return searchFirst(nums,mid+1,high,target);
        }
    }

    private int searchEnd(int[] nums, int low , int high , int target){
        if(low > high){
            return -1;
        }
        if(nums[high]==target){
            return high ;
        }

        int mid = (low+high)/2;
        if(nums[mid]<= target && target<nums[high]){
            return searchEnd(nums,mid,high-1,target);
        }else{
            return searchEnd(nums,low,mid-1,target);
        }
    }
}
