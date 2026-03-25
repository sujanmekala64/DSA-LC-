class Solution {
    class Pair{
        int row;
        int col;
        public Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> queue = new LinkedList<>();
        int r=image.length;
        int c=image[0].length;
        int vis[][] = new int[r][c];
        int rows[] = {-1,1,0,0};
        int cols[] = {0,0,-1,1};
        queue.offer(new Pair(sr,sc));
        int normal=image[sr][sc];
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                Pair p=queue.poll();
                int row=p.row;
                int col=p.col;
                vis[row][col]=1;
                image[row][col]=color;
                for(int i=0;i<4;i++){
                    int newrow=rows[i]+row;
                    int newcol=cols[i]+col;
                    if(newrow<0 || newrow>=r || newcol<0 || newcol>=c || vis[newrow][newcol]==1 || image[newrow][newcol]!=normal) continue;
                    queue.offer(new Pair(newrow,newcol));
                }
            }
        }
        return image;
    }
}