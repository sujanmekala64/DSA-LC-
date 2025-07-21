class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.length()==1) return s;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length()-1;i++){
            char p=s.charAt(i);
            if(p!=s.charAt(i-1) || p!=s.charAt(i+1)) sb.append(p);
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}