class Solution {
    public void printAns(List<List<String>> ansq,char board[][]){
        List<String> li = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String res = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q') res+='Q';
                else res+='.';
            }
            li.add(res);
        }
        ansq.add(new ArrayList<>(li));
    }
    public boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q') return false;
        }
        //diagonals
        //upper left
        int r=row;
        for(int c=col;r>=0&&c>=0;r--,c--){
            if(board[r][c]=='Q') return false;
        }
        //upper right
        r=row;
        for(int c=col;r>=0&&c<board.length;r--,c++){
            if(board[r][c]=='Q') return false;
        }
        //lower left
        r=row;
        for(int c=col;r<board.length&&c>=0;r++,c--){
            if(board[r][c]=='Q') return false;
        }
        //lower right
        r=row;
        for(int c=col;r<board.length&&c<board.length;r++,c++){
            if(board[r][c]=='Q') return false;
        }
        return true;
    }
    public void helper(char board[][],List<List<String>> answ,int col){
        if(col==board.length){
            printAns(answ,board);
            return ;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                helper(board,answ,col+1);
                board[row][col]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board,ans,0);
        return ans.size();  //instead of taking list u can just count instead of printAns since this method i got fixed used the same and printed list size
    }
}