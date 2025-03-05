class Solution {
    public long coloredCells(int n) {
        long count=1;
        long val=0;
        while(n>0){
            count+=val;
            val+=4;
            n--;
        }
        return count;

        /* u can also do this by enumeration 
            since f(1)=1, f(2)=5, f(3)=13
            it shows some pattern f(1)=1, f(2)=f(1)+4, f(3)=f(2)+8
            so the pattern is f(n)=f(n-1)+((n-1)*4)
            so it will be 1+4+8+12+....(n-1)
            1+4*(1+2+3+..(n-1))
            1+4*((n-1)*n)/2
            1+2*((n-1)*n)
            so it can also be 1+(long)(2*n*(n-1))
        */
    }
}