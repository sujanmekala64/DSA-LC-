class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean charcheck = false;
        boolean vowcheck = false;
        boolean conscheck = false;
        int c=0;
        for(int i=0;i<word.length();i++){
            char p=word.charAt(i);
            if((p>='A' && p<='Z') || (p>='a' && p<='z') || (p>='0' && p<='9')) c++;
            if(Character.isAlphabetic(p)){
                if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u' || p=='A' || p=='E' || p=='I' || p=='O' || p=='U') vowcheck=true;
                else conscheck=true;   
            }
        }
        if(c==word.length()) charcheck=true;
        return charcheck&&vowcheck&&conscheck;
    }
}