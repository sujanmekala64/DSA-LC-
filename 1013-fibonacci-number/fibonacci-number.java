class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int prev2 = 0;
        int prev1 = 1;
        for(int i=2;i<=n;i++){
            int temp=prev1+prev2;
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}