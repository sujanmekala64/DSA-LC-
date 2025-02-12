class Solution {
    public int[] sortArray(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums){
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        int idx=0;
        for(Integer keys:map.keySet()){
            int val=map.get(keys);
            while(val>0){
                nums[idx++]=keys;
                val--;
            }
        }
        return nums;
    }
}