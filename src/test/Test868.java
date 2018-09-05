package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zsh_paradise on 2018/8/30.
 *
 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。

 如果没有两个连续的 1，返回 0 。



 示例 1：

 输入：22
 输出：2
 解释：
 22 的二进制是 0b10110 。
 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
 第一对连续的 1 中，两个 1 之间的距离为 2 。
 第二对连续的 1 中，两个 1 之间的距离为 1 。
 答案取两个距离之中最大的，也就是 2 。
 示例 2：

 输入：5
 输出：2
 解释：
 5 的二进制是 0b101 。
 示例 3：

 输入：6
 输出：1
 解释：
 6 的二进制是 0b110 。
 示例 4：

 输入：8
 输出：0
 解释：
 8 的二进制是 0b1000 。
 在 8 的二进制表示中没有连续的 1，所以返回 0 。


 提示：

 1 <= N <= 10^9
 */
public class Test868 {
    //我写的第一中方法思路其实和大多数的不一样，我是利用hashmap的key没法重复的特性，
    // 存储了最后一个0和1的下标，然后进行计算。转换使用了java的类
    public static int binaryGap(int N) {
        int distance = 0 ;
        String[] s = Integer.toBinaryString(N).split("");
        Map<String,Integer> map = new HashMap<>(16);
        for (int i = 0; i <s.length ; i++) {
            if("1".equals(s[i])&&map.containsKey("1")){
                int temp = i-map.get("1");
                if(temp >distance){
                    distance = temp ;
                }
            }
            map.put(s[i],i);
        }


        return distance;
    }

    public static int binaryGap1(int N) {
        int[] A = new int[32];
        int[] B = new int[32];
        int t = 0;
        for(int i = 0; i < 32; ++i){
            if(((N >> i) & 1) != 0){
                A[t++] = i;
                B[t++]=1;
            }else{
                B[t++] = 0 ;
            }
        }
        int ans = 0;
        for (int i = 0; i < t - 1; ++i) {
            ans = Math.max(ans, A[i + 1] - A[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(binaryGap(22));
        binaryGap1(33);
    }
}
