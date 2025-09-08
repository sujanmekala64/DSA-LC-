class Solution {
    public boolean noDecimal(int val){
        while(val>0){
            if(val%10==0) return false;
            val=val/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        // int ans[] = new int[2];
        int a = 1;
        int b=n-a;
        while(!noDecimal(a) || !noDecimal(b)){
            a++;
            b--;
        }
        return new int[]{a,b};
    }
}