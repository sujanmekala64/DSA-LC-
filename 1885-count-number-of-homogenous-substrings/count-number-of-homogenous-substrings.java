class Solution {
    public int countHomogenous(String s) {
        int ans=1;
        int cnt=1;
        int mod = 1000000007;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
                ans=(ans+cnt)%mod;
            }
            else{
                ans=(ans+1)%mod;
                cnt=1;
            }
        }
        return ans%mod;
    }
}