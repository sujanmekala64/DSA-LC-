class Solution {
    public boolean doesAliceWin(String s) {
        for(char p:s.toCharArray()){
            if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        }
        return false;
    }
}