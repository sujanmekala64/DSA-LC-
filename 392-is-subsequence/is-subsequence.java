class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int idx2=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(idx2)) idx2++;
            if(idx2==s.length()) break;
        }
        return idx2==s.length();
    }
}