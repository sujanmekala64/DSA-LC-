class Solution {
    public boolean checkOnesSegment(String s) {
       boolean ch=false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1' && ch) return false;
        else if(s.charAt(i)=='0') ch=true;
       } 
       return true;
    //    if(s.contains("01")) return false;
    //    return true;
    }
}