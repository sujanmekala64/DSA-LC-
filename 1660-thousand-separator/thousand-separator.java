class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        if(s.length()<=3) return s;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i!=0 && ((s.length()-i)%3)==0){
                ans+='.';
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}