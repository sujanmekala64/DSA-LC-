class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(!map.containsKey(p)) map.put(p,1);
            else map.put(p,map.get(p)+1);
        }
        TreeMap<Character,Integer> sortedmap = new TreeMap<>((k1,k2)->{
            int compare = map.get(k2).compareTo(map.get(k1));
            if(compare==0) return k1.compareTo(k2);
            else return compare;
        });
        sortedmap.putAll(map);
        StringBuilder sb = new StringBuilder();
        for(Character it: sortedmap.keySet()){
            while(sortedmap.get(it)>0){
                sb.append(it);
                sortedmap.put(it,sortedmap.get(it)-1);
            }
        }
        return sb.toString();
    }
}