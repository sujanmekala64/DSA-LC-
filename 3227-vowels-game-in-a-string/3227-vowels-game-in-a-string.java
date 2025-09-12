class Solution {
    public boolean doesAliceWin(String s) {
        int cnt=0;
        for(char p:s.toCharArray()){
            if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') cnt++;
        }
        if(cnt==0) return false;
        return true;
    }
}