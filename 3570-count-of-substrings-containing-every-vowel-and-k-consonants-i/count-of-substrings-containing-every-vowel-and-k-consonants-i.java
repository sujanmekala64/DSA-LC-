class Solution {
    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }
    public boolean check(List<Character> li,int k){
        Set<Character> set = new HashSet<>();
        int cnt=0;
        for(int i=0;i<li.size();i++){
            char p=li.get(i);
            if(isVowel(p)) set.add(li.get(i));
            else cnt++;
        }
        return set.size()==5 && cnt==k;
    }
    public int countOfSubstrings(String word, int k) {
        int cnt=0;
        for(int i=0;i<word.length();i++){
            List<Character> li = new ArrayList<>();
            for(int j=i;j<word.length();j++){
                li.add(word.charAt(j));
                if(li.size()>=5+k){
                    if(check(li,k)) cnt++;
                }
            }
        }
        return cnt;
    }
}