package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zsh_paradise on 2018/9/6.
 * 18372016136
 * 机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：

 -2：向左转 90 度
 -1：向右转 90 度
 1 <= x <= 9：向前移动 x 个单位长度
 在网格上有一些格子被视为障碍物。

 第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])

 如果机器人试图走到障碍物上方，那么它将停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。

 返回从原点到机器人的最大欧式距离的平方。



 示例 1：

 输入: commands = [4,-1,3], obstacles = []
 输出: 25
 解释: 机器人将会到达 (3, 4)
 示例 2：

 输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 输出: 65
 解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处


 提示：

 0 <= commands.length <= 10000
 0 <= obstacles.length <= 10000
 -30000 <= obstacle[i][0] <= 30000
 -30000 <= obstacle[i][1] <= 30000
 答案保证小于 2 ^ 31
 */
public class Test874 {
    public static int robotSim(int[] commands, int[][] obstacles) {
        //确定方向坐标，[dx[],dy[]]就是每一步的行为点，{{dx[0],dx[0]},{dx[0],{dx[0]}}} 这表示向北走了2两部
        int[]  dx =  new int[]{0,1,0,-1};
        int[]  dy = new int[]{1,0,-1,0};
        int x = 0 , y=0,di=0 ;
        //获取路障点， 通过+3000 和<<16 等数据编码，把一个向量转变为一个数值
        Set<Long> obstacleSet  = new HashSet<>();
        for(int[] obstacle :obstacles){
            long ox = obstacle[0]+30000;
            long oy = obstacle[1]+30000;
            obstacleSet.add((ox<<16)+oy);
        }
        //循环计算每走一步的欧式距离，判断状态
        int ans = 0 ;
        for(int cmd:commands){
            //左转状态
            if(cmd == -2){
                di = (di+3)%4;
            }else if(cmd == -1){
                di =(di+1)%4;
            }else {
                for (int i = 0; i <cmd ; i++) {
                    int nx  = x +dx[di];
                    int ny  = y +dy[di];
                    long code =((nx+30000)<<16)+(ny+30000);
                    if(!obstacleSet.contains(code)){
                        x = nx ;
                        y = ny ;
                        ans=Math.max(ans,x*x+y*y);
                    }
                }
            }
        }
        return  ans ;
    }


    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
        int[][] obstacles = {{1,2}};
        int[] commands = {4,-1,3};
        int result = robotSim(commands,obstacles);
        System.out.println(result);
    }


}
