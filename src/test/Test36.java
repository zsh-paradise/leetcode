package test;

/**
 * 有效的数独
 * Created by zsh_paradise on 2019/4/24.
 */
public class Test36 {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for(int i =0 ; i < 9 ;i++ ){
            for(int j = 0 ; j <9 ; j++){
                if(board[i][j] !='.'){
                    int num =board[i][j]-'1';
                    if(row[i][num]||col[j][num]||block[i/3*3+j/3][num]){
                        return false;
                    }else {
                        row[i][num]= true;
                        row[j][num]=true;
                        block[i/3*3+j/3][num] = true ;
                    }
                }
            }
        }
        return  true;
    }
}
