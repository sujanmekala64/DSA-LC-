class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0;
        if(isNegative){
            x = x*-1; 
        }
        long reverse=0;
        int lastdigit;
        int g=0;
        while(x>0){
            lastdigit=x%10;
            reverse = reverse*10+lastdigit;
            x=x/10;
        }
        if(reverse>Math.pow(2,31)-1) return 0;
        else g = (int) reverse;
        return isNegative?g*-1:g;
    }
}