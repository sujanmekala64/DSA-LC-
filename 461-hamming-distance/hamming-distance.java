class Solution {
    public int hammingDistance(int x, int y) {
        int xored = (x^y);
        int cnt=0;
        while(xored!=0){
            xored = (xored&(xored-1));
            cnt++;
        }
        return cnt;
    }
}