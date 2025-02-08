class Solution {
    public int countPrimes(int n) {
        int cnt=1;
        if(n<=1) return 0;
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    if(isPrime[j]) cnt++;
                    isPrime[j] = false;
                }
            }
        }
        return n-cnt-1;
    }
}