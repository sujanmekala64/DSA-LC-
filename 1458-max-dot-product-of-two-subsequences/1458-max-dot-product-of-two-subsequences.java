class Solution {
    public int check(int nums1[],int nums2[],int idx1,int idx2,int m,int n,int dp[][]){
        if(idx1>=m || idx2>=n) return -1000000000;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        int first = nums1[idx1]*nums2[idx2];
        int callfirst = first+check(nums1,nums2,idx1+1,idx2+1,m,n,dp);
        int takei=check(nums1,nums2,idx1,idx2+1,m,n,dp);
        int takej=check(nums1,nums2,idx1+1,idx2,m,n,dp);
        return dp[idx1][idx2]=Math.max(first,Math.max(callfirst,Math.max(takei,takej)));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        for(int i=0;i<=nums1.length;i++){
            for(int j=0;j<=nums2.length;j++){
                dp[i][j]=-1;
            }
        }
        return check(nums1,nums2,0,0,nums1.length,nums2.length,dp);
    }
}