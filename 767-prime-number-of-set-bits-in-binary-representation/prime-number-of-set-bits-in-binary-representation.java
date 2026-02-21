class Solution {
    public boolean isPrime(int cnt){
        if(cnt==1 || (cnt!=2 && cnt%2==0)) return false;
        for(int i=3;i*i<=cnt;i+=2){
            if(cnt%i==0) return false;
        } 
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
       int ans=0;
       String s="";
       int cnt=0;
       for(int i=left;i<=right;i++){
         cnt=Integer.bitCount(i); //returns no. of 1's
         if(isPrime(cnt)) ans++;
       } 
       return ans;
    }
}