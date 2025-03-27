class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            if(!map.containsKey(val)) map.put(val,1);
            else map.put(val,map.get(val)+1);
        }
        int dom=-1;
        for(Integer key:map.keySet()){
            if(map.get(key)>(nums.size()/2)){
                dom=key;
                break;
            }
        }
        if(dom==-1) return -1;
        int cntdom=0;
        int freq=map.get(dom);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==dom) cntdom++;
            if((cntdom*2)>(i+1) && ((freq-cntdom)*2)>(nums.size()-i-1)) return i;
        }
        return -1;
    }
}