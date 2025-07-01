class Solution {
    public int possibleStringCount(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char p:word.toCharArray()) map.put(p,map.getOrDefault(p,0)+1);
        int cnt=0;
        for(char key:map.keySet()){
            if(map.get(key)>1) cnt+=map.get(key)-1;
        }
        return cnt+1;
    }
}