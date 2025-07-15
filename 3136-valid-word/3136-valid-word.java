class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u' || p=='A' || p=='E' || p=='I' || p=='O' || p=='U') return true;
        return false;
    }
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowels=0;
        int cons=0;
        int num=0;
        for(char p:word.toCharArray()){
            if(Character.isAlphabetic(p)){
                if(isVowel(p)) vowels++;
                else cons++;
            }
            else if(Character.isDigit(p)){
                num++;
            }
            else return false;
        }
        if(cons>=1 && vowels>=1) return true;
        return false;
    }
}