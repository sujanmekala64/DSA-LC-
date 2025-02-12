class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];
        int vis[][] = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.offer(new Pair(i,j));
                    ans[i][j]=count;
                    vis[i][j]=1;
                }
            }
        }
        count++;
        int rows[] = {-1,0,1,0};
        int cols[] = {0,1,0,-1};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Pair vals = queue.poll();
                int row = vals.row;
                int col = vals.col;
                for(int j=0;j<4;j++){
                    int newrow = row+rows[j];
                    int newcol = col+cols[j];
                    if(newrow<0 || newrow>=m || newcol<0 || newcol>=n || vis[newrow][newcol]==1) continue;
                    vis[newrow][newcol]=1;
                    ans[newrow][newcol]=count;
                    queue.offer(new Pair(newrow,newcol));
                }
            }
            count++;
        }
        return ans;
    }
}