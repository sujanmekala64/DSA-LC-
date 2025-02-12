class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++){
            char p=order.charAt(i);
            while(map.containsKey(p) && map.get(p)!=0){
                sb.append(p);
                map.put(p,map.get(p)-1);
            }
        }
        for(Character keys:map.keySet()){
            int val=map.get(keys);
            while(val!=0){
                val--;
                sb.append(keys);
            }
        }
        return sb.toString();
    }
}