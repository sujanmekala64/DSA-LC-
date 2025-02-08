class Solution {
    Integer[][] memo;
    public int calculateMinimumHP(int[][] dungeon) {
        memo=new Integer[dungeon.length][dungeon[0].length];
        int ans = calculateMinimumHP(dungeon,0,0);
        if(ans==0 && dungeon[0][0]<0) ans=dungeon[0][0];
        return ans>=0?1:-1*ans+1;
    }
    public int calculateMinimumHP(int[][] dungeon , int i, int j) {
        if(i==dungeon.length-1 && j==dungeon[0].length-1){
            return dungeon[i][j]>=0?0:dungeon[i][j];
        }
        if(i>=dungeon.length || j>=dungeon[0].length){
            return Integer.MIN_VALUE;
        }
        if(memo[i][j]!=null){
            return memo[i][j];
        }
        int bottom =  calculateMinimumHP(dungeon, i+1,j);
        int right = calculateMinimumHP(dungeon, i,j+1);
        int val=dungeon[i][j] + Math.max(bottom,right);
        return memo[i][j] = val>0?0:val;
    }
}