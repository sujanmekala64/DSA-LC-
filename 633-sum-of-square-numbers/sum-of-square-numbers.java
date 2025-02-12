class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (int)Math.sqrt(c);
        long sum=0;
        while(l<=r){
            sum=l*l+r*r;
            if(sum==c) return true;
            else if(sum>c) r--;
            else l++;
        }
        return false;
    }
}