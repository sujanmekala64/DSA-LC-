class Solution {
    public void check(int r,int c,int m,int n,char vals[][]){
        //four directions
        //left col-1
        int temp=c-1;
        while(temp>=0){
            if(vals[r][temp]==0 || vals[r][temp]=='F') vals[r][temp]='F';
            else break;
            temp--;
        }
        //right col+1
        temp=c+1;
        while(temp<n){
            if(vals[r][temp]==0 || vals[r][temp]=='F') vals[r][temp]='F';
            else break;
            temp++;
        }
        //up row-1
        temp=r-1;
        while(temp>=0){
            if(vals[temp][c]==0 || vals[temp][c]=='F') vals[temp][c]='F';
            else break;
            temp--;
        }
        //don row+1
        temp=r+1;
        while(temp<m){
            if(vals[temp][c]==0 || vals[temp][c]=='F') vals[temp][c]='F';
            else break;
            temp++;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int ans=0;
        char vals[][] = new char[m][n];
        for(int i=0;i<guards.length;i++){
            vals[guards[i][0]][guards[i][1]]='G';
        }
        for(int i=0;i<walls.length;i++){
            vals[walls[i][0]][walls[i][1]]='W';
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vals[i][j]=='G'){
                    check(i,j,m,n,vals);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vals[i][j]==0) ans++;
            }
        }
        return ans;
    }
}