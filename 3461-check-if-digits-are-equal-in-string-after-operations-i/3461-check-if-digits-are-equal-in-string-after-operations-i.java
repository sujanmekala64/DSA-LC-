class Solution {
    public boolean hasSameDigits(String s) {
        String val=s;
        String newstr=s;
        while(val.length()>2){
            val=newstr;
            newstr="";
            for(int i=1;i<val.length();i++){
                int n1 = val.charAt(i)-'0';
                int n2 = val.charAt(i-1)-'0';
                int tot = (n1+n2)%10;
                newstr+=tot;
            }
        }
        return val.charAt(0)==val.charAt(1);
    }
}