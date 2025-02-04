class Solution {
    public int longestValidParentheses(String s) {
        int left=0,right=0,maxi=0;
        for(int i=0;i<s.length();i++){ //forword
            char p = s.charAt(i);
            if(p=='(') left+=1;
            if(p==')') right+=1;
            if(left==right){
                maxi=Math.max(maxi,left+right);
            } 
            else if(right>left){
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--){ //backword
            char p = s.charAt(i);
            if(p=='(') left+=1;
            if(p==')') right+=1;
            if(left==right){
                maxi=Math.max(maxi,left+right);
            } 
            else if(left>right){
                left=0;
                right=0;
            }
        }
        return maxi;
    }
}