class Solution {
    public int countTriples(int n) {
        int ans=0;
        int squares=0;
        int val=0;
        for(int i=1;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                squares = (i*i+j*j);
                val = (int)Math.sqrt(squares);
                if(val*val==squares && val<=n) ans+=2;
            }
        }
        return ans; 
    }
}