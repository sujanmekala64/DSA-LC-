class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String newstr="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) newstr+=s.charAt(i);
        }
        int start=0;
        int end=newstr.length()-1;
        while(start<end){
            if(newstr.charAt(start)!=newstr.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}