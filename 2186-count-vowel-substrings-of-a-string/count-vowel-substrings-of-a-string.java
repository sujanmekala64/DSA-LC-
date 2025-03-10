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
            int lastvowel=-1;
            set.clear();
            int cnter=0;
            for(int j=i;j<word.length();j++){
                if(isVowel(word.charAt(j))){
                    set.add(word.charAt(j));
                    lastvowel=j;
                }
                else break;
                if(set.size()==5 && cnter==0) cnt+=1;
            }
        }
        return cnt;
    }
}