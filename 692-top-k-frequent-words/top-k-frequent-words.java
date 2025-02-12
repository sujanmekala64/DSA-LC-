class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String num:words){
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        TreeMap<String,Integer> sortedmap = new TreeMap<>((k1,k2)->{
            int compare = map.get(k2).compareTo(map.get(k1));
            if(compare==0) return k1.compareTo(k2);
            else return compare;
        });
        sortedmap.putAll(map);
        List<String> li = new ArrayList<>();
        for(String keys:sortedmap.keySet()){
            if(k!=0){
                li.add(keys);
                k--;
            }
        }
        return li;
    }
}