class Solution {
    public String makeFancyString(String s) {
        String ans="";
        if(s.length()==1) return s;
        ans+=s.charAt(0);
        for(int i=1;i<s.length()-1;i++){
            char p=s.charAt(i);
            if(p!=s.charAt(i-1) || p!=s.charAt(i+1)) ans+=p;
        }
        ans+=s.charAt(s.length()-1);
        return ans;
    }
}