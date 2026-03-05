class Solution {
    public int checkScore(String s,char p){
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)==p) ans++; 
            else if(i%2==1 && s.charAt(i)!=p) ans++;
        }
        return ans;
    }
    public int minOperations(String s) {
        int val1 = checkScore(s,'0');
        int val2 = checkScore(s,'1');
        return Math.min(val1,val2);
    }
}