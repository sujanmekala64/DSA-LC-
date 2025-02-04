class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String st:strs){
            char p[] = st.toCharArray();
            Arrays.sort(p);
            String sortedstr = String.valueOf(p);
            if(!map.containsKey(sortedstr)){
                map.put(sortedstr,new ArrayList<>());
            }
            map.get(sortedstr).add(st);
        }
        return new ArrayList<>(map.values());
    }
}