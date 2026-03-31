class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> newmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            newmap.put(nums[i],newmap.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1) map.remove(nums[i]);
            else map.put(nums[i],map.getOrDefault(nums[i],0)-1);
            nums[i]=newmap.size()-map.size();
        }
        return nums;
    }
}