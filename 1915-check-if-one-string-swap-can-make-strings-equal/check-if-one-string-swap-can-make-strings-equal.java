class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char p1='0';
        char p2='0';
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(cnt==1){
                    p1=s2.charAt(i);
                    p2=s1.charAt(i);
                }
                else if(cnt==2){
                    if(s1.charAt(i)!=p1 || s2.charAt(i)!=p2) return false;
                }
                else if(cnt>2) return false;
            }
        }
        return cnt%2==0;
    }
}