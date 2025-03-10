class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }
    public int countVowelSubstrings(String word) {
        int cnt=0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(!isVowel(word.charAt(i))) continue;
            set.clear();
            for(int j=i;j<word.length();j++){
                if(isVowel(word.charAt(j))) set.add(word.charAt(j));
                else break;
                if(set.size()==5) cnt+=1;
            }
        }
        return cnt;
    }
}