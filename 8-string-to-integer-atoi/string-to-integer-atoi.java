class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        long res=0;
        int index=0;
        if(s.charAt(0)=='+' || s.charAt(0)=='-'){
            sign = s.charAt(0)=='-'?-1:1;
            index++;
        }
        while(index<s.length()){
            char c  = s.charAt(index);
            if(!Character.isDigit(c)) break;
            else{
                res = res*10+(c-'0');
                if(sign*res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(sign*res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int)(sign*res);
    }
}