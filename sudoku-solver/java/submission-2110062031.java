class Solution {
    public boolean check(char[][] board, int row, int col, int num){
        int i = 0;
        while(i<board.length){
            if(board[row][i]==num || board[i][col]==num) return false;
            i++;
        }

        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    };


    public boolean tryNumber(char[][] board, int row, int col, char num){
        if(num>'9')
            return false;
        
        if(check(board,row,col,num)){ // Checking current number can be placed
            board[row][col] = num;

            if(tryColumn(board,row,col+1)){
                return true;
            }

            board[row][col] = '.';
        }

        return tryNumber(board,row,col,++num);
    }

    public boolean tryColumn(char[][] board, int row, int col){
        if(col==board[0].length){ // Current row completed
            return tryRow(board,row+1);
        }

        if(board[row][col]!='.'){ // If cell is already filled then 
            return tryColumn(board,row,col+1);
        }

        return tryNumber(board,row,col,'1'); // For empty cell
    }

    public boolean tryRow(char[][] board, int row){
        // Entire board is completed
        if(row==board.length){
            return true;
        }

        // Starting from the first column
        return tryColumn(board, row, 0);
    }

    public void solveSudoku(char[][] board) {
        tryRow(board, 0);
    }
}