class Solution {
    public boolean checkPowersOfThree(int n) {
        int pt=0;
        while((int)(Math.pow(3,pt))<=n){
            pt++;
        }
        pt=pt-1;
        while(pt>=0){
            int ch=(int)(Math.pow(3,pt));
            if(n>=ch){
                n-=ch;
            }
            pt--;
            if(n==0) return true;
        }
        return n==0;
    }
}