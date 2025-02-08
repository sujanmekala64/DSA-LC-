class Solution {
    // List<List<String>> ans = new ArrayList<>();
    // int size=1000;
    public int check(String s,int idx,int dp[]){
        if(idx==s.length()) return 0;
        int mincost=Integer.MAX_VALUE;
        if(dp[idx]!=-1) return dp[idx];
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                // li.add(s.substring(idx,i));
                // check(s,i,li);
                // li.remove(li.size()-1);
                int cost = 1+check(s,i+1,dp);
                mincost=Math.min(cost,mincost);
            }
        }
        return dp[idx]=mincost;
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public int minCut(String s) {
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return check(s,0,dp)-1;
    }
}