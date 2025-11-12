class Solution {
    public boolean common(String word1,String word2){
        for(char p:word1.toCharArray()){
            if(word2.indexOf(p)!=-1) return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        int ans=0;
        for(int i=0;i<words.length;i++){
            int n1=words[i].length();
            for(int j=i+1;j<words.length;j++){
                if(common(words[i],words[j])){
                    ans=Math.max(ans,n1*words[j].length());
                    break;
                }
            }
        }
        return ans;
    }
}