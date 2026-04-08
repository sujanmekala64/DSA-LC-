class Solution {
    public int minBitFlips(int start, int goal) {
        int xored = (start^goal);
        int cnt=0;
        while(xored!=0){
            xored = (xored&(xored-1));
            cnt++;
        }
        return cnt;
    }
}