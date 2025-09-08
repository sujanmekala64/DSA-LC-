class Solution {
    public boolean noDecimal(int val){
        String s = String.valueOf(val);
        for(char p:s.toCharArray()){
            if(p=='0') return false;
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