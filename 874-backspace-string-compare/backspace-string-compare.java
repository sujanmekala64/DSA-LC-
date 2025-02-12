class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && sb.length()>0) sb.deleteCharAt(sb.length()-1);
            else if(s.charAt(i)!='#') sb.append(s.charAt(i));
        }
        String snew = sb.toString();
        sb=new StringBuilder();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && sb.length()>0) sb.deleteCharAt(sb.length()-1);
            else if(t.charAt(i)!='#') sb.append(t.charAt(i));
        }
        String tnew = sb.toString();
        if(snew.equals(tnew)) return true;
        return false;
    }
}