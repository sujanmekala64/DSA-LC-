class Solution {
    public void checkBFS(char[][] board,int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c || board[i][j] == 'X' || board[i][j] == 'E') return ;
        board[i][j]='E';
        checkBFS(board,i+1,j,r,c);
        checkBFS(board,i-1,j,r,c);
        checkBFS(board,i,j+1,r,c);
        checkBFS(board,i,j-1,r,c);
    }
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0 || i==r-1 || j==0 || j==c-1) && board[i][j]=='O'){
                    checkBFS(board,i,j,r,c);
                }
            }
        }
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (board[row][col] == 'E') {
                    board[row][col] = 'O';
                } else if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                }
            }
        }
    }
}