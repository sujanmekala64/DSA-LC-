class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char p = rings.charAt(i);
            int val = rings.charAt(i+1)-'0';
            if(!map.containsKey(val)){
                HashSet<Character> set = new HashSet<>();
                set.add(p);
                map.put(val,set);
            }
            else map.get(val).add(p);
        }
        int cnt=0;
        for(int key:map.keySet()) if(map.get(key).size()==3) cnt++;
        return cnt;
    }
}