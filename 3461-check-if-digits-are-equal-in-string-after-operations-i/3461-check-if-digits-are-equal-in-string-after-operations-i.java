class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String newstr="";
            for(int i=1;i<s.length();i++){
                int n1 = s.charAt(i)-'0';
                int n2 = s.charAt(i-1)-'0';
                int tot = (n1+n2)%10;
                newstr+=tot;
            }
            s=newstr;
        }
        return s.charAt(0)==s.charAt(1);
    }
}