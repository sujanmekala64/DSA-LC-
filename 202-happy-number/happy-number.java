class Solution {
    public boolean isHappy(int n) {
        int cnt=0;
        while(cnt<15){
            int temp=n;
            int ans = 0;
            while(temp>0){
                int f = temp%10;
                temp/=10;
                ans+=Math.pow(f,2); 
            }
            n=ans;
            if(n==1){
                return true;
            }
            cnt++;
        }
        return false;
    }
}