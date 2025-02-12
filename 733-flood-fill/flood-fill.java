class Solution {
    public void check(int val,int sr,int sc,int color,int[][] image,int row,int col,boolean vis[][]){
        if(sr<0 || sr>=row || sc<0 || sc>=col || image[sr][sc]==color || vis[sr][sc]) return ;
        if(!vis[sr][sc] && image[sr][sc]==val){
            vis[sr][sc]=true;
            image[sr][sc]=color;
            check(val,sr-1,sc,color,image,row,col,vis); //up
            check(val,sr+1,sc,color,image,row,col,vis); //down
            check(val,sr,sc-1,color,image,row,col,vis); //left
            check(val,sr,sc+1,color,image,row,col,vis); //right
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int val=image[sr][sc];
        boolean vis[][] = new boolean[image.length][image[0].length];
        check(val,sr,sc,color,image,image.length,image[0].length,vis);
        return image;
    }
}