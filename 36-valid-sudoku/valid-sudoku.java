class Solution {
    boolean ans=true;
    public boolean isSafe(char board[][],int r,int c,char number){
        //horizontal
        for(int i=0;i<9;i++){
            if(i!=c && board[r][i]==number) return false;
        }
        //vertical
        for(int i=0;i<9;i++){
            if(i!=r && board[i][c]==number) return false;
        }
        int startrow = (r/3)*3;
        int startcol = (c/3)*3;
        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(i!=r && j!=c && board[i][j]==number) return false;
            }
        }
        return true;
    }
    public void helper(char board[][],int row,int col){
        // if(!ans) return ;
        if(col==9) return ;
        int nrow=0;
        int ncol=0;
        if(row<8){
            nrow=row+1;
            ncol=col;
        }
        else{
            nrow=0;
            ncol=col+1;
        }
        if(board[row][col]!='.'){
            if(isSafe(board,row,col,board[row][col])){
                helper(board,nrow,ncol);
            }
            else{
                ans=false;
            }
        }
        else helper(board,nrow,ncol);
    }
    public boolean isValidSudoku(char[][] board) {
        helper(board,0,0);
        return ans;
    }
}