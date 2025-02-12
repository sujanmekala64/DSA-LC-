class Solution {
    public int check(int n,int currle,int copylen){
        if(currle==n) return 0;
        if(currle>n) return 100000;
        int copyandpaste = 2+check(n,currle*2,currle);
        int pasteonly = 1+check(n,currle+copylen,copylen);
        return Math.min(copyandpaste,pasteonly);
    }
    public int minSteps(int n) {
        if(n<=1) return 0;
        return 1+check(n,1,1);
    }
}