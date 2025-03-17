class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        for(Integer keys:map.keySet()){
            if(map.get(keys)%2!=0) return false;
        }
        return true;
    }
}