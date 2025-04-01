class Solution {
    public long check(int questions[][],int idx,long dp[]){
        if(idx>=questions.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        long take=questions[idx][0]+check(questions,idx+questions[idx][1]+1,dp);
        long nottake=check(questions,idx+1,dp);
        return dp[idx]=Math.max(take,nottake);
    }
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length+1];
        for(int i=0;i<=questions.length;i++) dp[i]=-1;
        return check(questions,0,dp);
    }
}