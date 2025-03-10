class Solution {
    public long countOfSubstrings(String word, int k) {
        if(word.length()<(5+k)){
            return 0;
        }
        return count(word,k)-count(word,k+1);
    }
    private long count(String word,int k){
        long ans=0;
        int cons=0,l=0;
        Map<Character,Integer> vowel=new HashMap<>();
        for(int r=0;r<word.length();r++){
            char ch=word.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }
            else{
                cons++;
            }
            while(vowel.size()==5 && cons>=k){
                ans+=word.length()-r;
                char lch=word.charAt(l++);
                if(lch=='a' || lch=='e' || lch=='i' || lch=='o' || lch=='u'){
                    vowel.put(lch,vowel.get(lch)-1);
                    if(vowel.get(lch)==0){
                        vowel.remove(lch);
                    }
                }
                else{
                    cons--;
                }
            }
        }
        return ans;
    }
}