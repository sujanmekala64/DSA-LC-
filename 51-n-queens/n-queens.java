class Solution {
    List<List<String>> ans = new ArrayList<>();
    public void prints(char[][] board){
        List<String> val = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String res="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q') res+='Q';
                else res+='.';
            }
            val.add(res);
        }
        ans.add(val);
    }
    public boolean isSafe(char board[][],int row,int col){
        //hoorizontal & vertical
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q') return false;
            if(board[i][col]=='Q') return false;
        }
        //diagnols
        //upper left
        int i=row;
        for(int j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        //upper right
        i=row;
        for(int j=col;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        //bottom left
        i=row;
        for(int j=col;i<board.length&&j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        //botto, right
        i=row;
        for(int j=col;i<board.length&&j<board.length;i++,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public void helper(char board[][],int n,int col){
        if(col==board.length){
            prints(board);
            return ;
        }
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                helper(board,n,col+1);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        helper(board,n,0);
        return ans;
    }
}
