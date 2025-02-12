class Solution {
    public int arrangeCoins(int n) {
        int cnt=0;
        int f=1;
        while(n>=f){
            n-=f;
            f++;
            cnt++;
        }
        return cnt;
    }
}