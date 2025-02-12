class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int x:hand){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int card:map.keySet()){
            int count = map.get(card);
            if(count==0) continue;
            for(int i=0;i<groupSize;i++){
                if(map.getOrDefault(card+i,0)<count){
                    return false;
                }
                map.put(card+i,map.get(card+i)-count);
            }
        }
        return true;
    }
}