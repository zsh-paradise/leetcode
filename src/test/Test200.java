package test;

/**
 * Created by zsh_paradise on 2018/10/9.
 */
public class Test200 {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0){
            return  0 ;
        }
        int rows = grid.length ;
        int cols = grid[0].length;
        int count = 0 ;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                if(grid[i][j] =='1'){
                    count++;
                    dfsSearch(grid,i,j,rows,cols);
                }
            }

        }
        return count;
    }

    private void  dfsSearch(char[][] grid ,int i ,int j ,int rows, int cols){
        if(i<0||i>=rows||j<0||j>=cols){
            return;
        }
        if(grid[i][j] !='1'){
            return;
        }
        grid[i][j]='0';
        dfsSearch(grid,i+1,j,rows,cols);
        dfsSearch(grid,i-1,j,rows,cols);
        dfsSearch(grid,i,j+1,rows,cols);
        dfsSearch(grid,i,j-1,rows,cols);
    }
}
