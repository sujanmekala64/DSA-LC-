class Store{
    int row;
    int col;
    Store(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int zecnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) zecnt++;
            }
        }
        if(zecnt==grid[0].length*grid.length) return 0;
        Queue<Store> queue = new LinkedList<>();
        int ones=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) queue.offer(new Store(i,j));
                if(grid[i][j]==1) ones++;
            }
        } 
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n!=0){
                Store a = queue.poll();
                int r = a.row;
                int c = a.col;
                if(r<row-1 && grid[r+1][c]==1){
                    ones--;
                    queue.offer(new Store(r+1,c));
                    grid[r+1][c]=2;
                }
                if(r>0 && grid[r-1][c]==1){
                    ones--;
                    queue.offer(new Store(r-1,c));
                    grid[r-1][c]=2;
                }
                if(c<col-1 && grid[r][c+1]==1){
                    ones--;
                    queue.offer(new Store(r,c+1));
                    grid[r][c+1]=2;
                }
                if(c>0 && grid[r][c-1]==1){
                    ones--;
                    queue.offer(new Store(r,c-1));
                    grid[r][c-1]=2;
                }
                n--;
            }
            ans++;
        }
        return ones!=0?-1:ans-1;
    }
}