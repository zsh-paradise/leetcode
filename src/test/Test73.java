package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 矩阵置零
 * 给定一个 m x n 的矩阵，
 * 如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * Created by zsh_paradise on 2019/1/30.
 *
 * 思路：先遍历二维数组，找到为0的坐标，然后再对为零坐标的横竖进行横纵处理
 */
public class Test73 {
    public static  void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Map<Integer,Integer> temp = new HashMap(64);
        List<int[]> lists = new ArrayList<>();
        for(int i=0 ; i<m ;i++){
            for(int j= 0 ; j<n ;j++){
                if(matrix[i][j]==0){
                    lists.add(new int[]{i, j});
                }
            }
        }

        for(int i = 0 ; i< lists.size();i++){
            int tempm = lists.get(i)[0];
            int tempn = lists.get(i)[1];
            for (int j = 0; j <m ; j++) {
                if(j==tempm){
                    continue;
                }
                matrix[j][tempn]=0;
            }
            for (int j = 0; j <n ; j++) {
                if(j==tempn){
                    continue;
                }
                matrix[tempm][j] =0 ;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,6},{1,3,4,5}};
        setZeroes(arr);

        System.out.println("=========");
    }
}
