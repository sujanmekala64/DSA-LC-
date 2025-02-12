class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> output = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String res = "";
            for(int j=0;j<words[i].length();j++){
                int q = words[i].charAt(j) - 'a';
                res+=morse[q];
            }
            output.add(res);
        }
        return output.size();
    }
}