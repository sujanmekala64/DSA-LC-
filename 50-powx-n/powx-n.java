class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long m=Math.abs((long)n);
        while(m>0){
            if(m%2==1) res=res*x;
            m=m/2;
            x=x*x;
        }
        return n<0?1/res:res;
    }
}