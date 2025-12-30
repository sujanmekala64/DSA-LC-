class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean nums[] = new boolean[10];
        boolean check=true;
        int sum=0;
        int ans=0;
        for(int i=0;i<rows-2;i++){
            for(int j=0;j<cols-2;j++){
                nums=new boolean[10];
                check=true;
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(grid[r][c]<1 || grid[r][c]>9 || nums[grid[r][c]]){
                            check=false;
                            break;
                        }
                        nums[grid[r][c]]=true;
                    }
                }
                if(!check) continue;
                sum=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                for(int x=0;x<3;x++){
                    if((grid[i][j+x]+grid[i+1][j+x]+grid[i+2][j+x])!=sum){
                        check=false;
                        break;
                    }
                    if((grid[i+x][j]+grid[i+x][j+1]+grid[i+x][j+2])!=sum){
                        check=false;
                        break;
                    }
                }
                if(grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2]!=sum) check=false;
                if(check) ans++;
            }
        }
        return ans;
    }
}