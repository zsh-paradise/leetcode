package test;

/**盛最多水的容器
 * Created by zsh_paradise on 2019/4/8.
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

 说明：你不能倾斜容器，且 n 的值至少为 2。
 输入: [1,8,6,2,5,4,8,3,7]
 输出: 49


 */
public class Test11 {
    public int maxArea(int[] height) {
        int result  = 0 ;
        for(int i =0 ; i <height.length;i++){
            for(int j = i+1 ; j<height.length;j++){
                result = Math.max(result , Math.min(height[i],height[j])*(j-i));
            }
        }
        return result ;
    }
    //使用双指针法， 这个方案其实我想到了，但是双指针我想的是从0,1出发，其实要从一头一尾出发，
    //然后就需要思考指针移动的条件，如果左边的矮，就右移，如果是右边的矮就左移。
    public int maxArea1(int[] height) {
       int i= 0 , j = height.length-1,result = 0 ;
       while(i<j){
           result = Math.max(result,Math.min(height[i],height[j])*(j-i));
           if(height[i]<height[j]){
               i++;
           }else {
               j--;
           }
       }
       return  result;

    }
}
