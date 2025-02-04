class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            String s = Integer.toString(x);
            int n = s.length();
            int count=0;
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
