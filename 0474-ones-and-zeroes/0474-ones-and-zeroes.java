class Solution {
    public int check(int count[][],int m,int n,int idx,int dp[][][]){
        if(idx==count.length){
            return 0;
        }
        if(dp[idx][m][n]!=-1) return dp[idx][m][n];
        int take=0;
        int donttake=0;
        if(m>=count[idx][0] && n>=count[idx][1]){
            take=1+check(count,m-count[idx][0],n-count[idx][1],idx+1,dp);
        }
        donttake=0+check(count,m,n,idx+1,dp);
        return dp[idx][m][n]=Math.max(take,donttake);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int arr[][] = new int[strs.length][2];
        int z;
        int o;
        String str;
        for(int i=0;i<strs.length;i++){
            str=strs[i];
            z=0;
            o=0;
            for(char p:str.toCharArray()){
                if(p=='0') z++;
                else o++;
            }
            arr[i][0]=z;
            arr[i][1]=o;
        }
        int dp[][][] = new int[strs.length+1][m+1][n+1];
        for(int i=0;i<=strs.length;i++){
            for(int j=0;j<=m;j++){
                for(int k=0;k<=n;k++) dp[i][j][k]=-1;
            }
        }
        int ans = check(arr,m,n,0,dp);
        return ans;
    }
}