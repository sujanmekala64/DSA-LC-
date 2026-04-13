class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        String str="";
        for(int i=0;i<s.length()-9;i++){
            str=s.substring(i,i+10);
            if(set.contains(str)) ans.add(str);
            else set.add(str);
        }
        return new ArrayList<>(ans);
    }
}