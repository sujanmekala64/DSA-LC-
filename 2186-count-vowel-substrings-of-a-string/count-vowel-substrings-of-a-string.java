class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }
    public int countVowelSubstrings(String word) {
        int cnt=0;
        for(int i=0;i<word.length();i++){
            int lastvowel=-1;
            Set<Character> set = new HashSet<>();
            int cnter=0;
            for(int j=i;j<word.length();j++){
                if(isVowel(word.charAt(j))){
                    set.add(word.charAt(j));
                    lastvowel=j;
                }
                else cnter++;
                if(set.size()==5 && cnter==0) cnt+=1;

            }
        }
        return cnt;
    }
}