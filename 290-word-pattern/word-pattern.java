class Solution {
    public boolean wordPattern(String pattern, String s) {
        String splits[] = s.split("\\s+");
        if(splits.length!=pattern.length()) return false;
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String f = splits[i];
            if(map.containsKey(p)){
                if(!map.get(p).equals(f)) return false;
            }
            else{
                if(map.containsValue(f)) return false;
                map.put(p,f);
            }
        }
        return true;
    }
}