class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        Map map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                res[1]=i;
                res[0]=(int)map.get(target-nums[i]);
                return res;
            }
        }
        return res;
    }
}