class Solution {
    public void checkMaxFreq(int freq[],int freq2[]){
        for(int i=0;i<26;i++){
            freq[i]=Math.max(freq[i],freq2[i]);
        }
    }
    public boolean checkCondition(int freq[],int freq3[]){
        for(int i=0;i<26;i++){
            if(freq[i]>freq3[i]) return false;
        }
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int freq[] = new int[26];
        for(String word:words2){
            int freq2[] = new int[26];
            for(char p:word.toCharArray()) freq2[p-'a']++;
            checkMaxFreq(freq,freq2);
        }
        for(String word:words1){
            int freq3[] = new int[26];
            for(char p:word.toCharArray()){
                freq3[p-'a']++;
            }
            if(checkCondition(freq,freq3)) ans.add(word);
        }
        return ans;
    }
}