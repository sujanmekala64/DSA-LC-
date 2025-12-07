class Solution {
    public int countOdds(int low, int high) {
        int ans=0;
        if(low%2==1 || high%2==1) ans+=1;
        ans+=(high-low)/2;
        return ans;
    }
}