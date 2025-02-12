class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2!=0) return false;
        int u=0;
        int l=0;
        for(int i=0;i<moves.length();i++){
            char p = moves.charAt(i);
            if(p=='U') u++;
            else if(p=='D') u--;
            else if(p=='L') l++;
            else l--;
        }
        if(u==0 && l==0) return true;
        return false;
    }
}