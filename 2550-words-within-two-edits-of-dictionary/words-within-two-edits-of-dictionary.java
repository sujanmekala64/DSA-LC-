class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        int len=queries[0].length();
        int word=0;
        for(int j=0;j<queries.length;j++){
            for(int i=0;i<dictionary.length;i++){
                word=0;
                for(int k=0;k<len;k++){
                    if(dictionary[i].charAt(k)!=queries[j].charAt(k)) word++;
                    if(word>2) break;
                }
                if(word<=2){
                    ans.add(queries[j]);
                    break;
                }
            }
        }
        return ans;
    }
}