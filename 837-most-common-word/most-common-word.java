class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> banned_set = new HashSet<>();
        HashMap<String,Integer> paragraphs = new HashMap<>();
        for(String word:banned){
            banned_set.add(word);
        }
        String words[] = paragraph.toLowerCase().split("\\W+");
        for(String word:words){
            if(!banned_set.contains(word)){
                paragraphs.put(word,paragraphs.getOrDefault(word,0)+1);
            }
        }
        String result="";
        int max=-1;
        for(String word:paragraphs.keySet()){
            if(paragraphs.get(word)>max){
                max=paragraphs.get(word);
                result=word;
            }
        }
        return result;
    }
}