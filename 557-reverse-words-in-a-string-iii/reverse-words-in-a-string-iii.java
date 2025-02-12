class Solution {
    public String reverse(String s){
        String newstr="";
        for(int i=s.length()-1;i>=0;i--){
            newstr+=s.charAt(i);
        }
        return newstr;
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String rev="";
        for(int i=0;i<words.length;i++){
            rev += reverse(words[i]);
            if(i!=words.length-1) rev+=" ";
        }
        return rev;
    }
}