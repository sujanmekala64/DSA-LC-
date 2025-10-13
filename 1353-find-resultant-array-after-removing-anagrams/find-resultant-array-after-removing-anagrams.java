class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String s="";
        for(String word:words){
            char chars[] = word.toCharArray();
            Arrays.sort(chars);
            String res = new String(chars);
            System.out.println(s+" "+res);
            if(!s.equals(res)){
                ans.add(word);
                s=res;
            }
        }
        return ans;
    }
}