class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String newstr="";
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)-'0';
            int news = 1-a;
            newstr+=(char)(news+'0');
        }
        return Integer.parseInt(newstr,2);
    }
}