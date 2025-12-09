class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<nums.length;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        long ans=0;
        HashMap<Integer,Integer> newmap = new HashMap<>();
        long MOD=1_000_000_007;
        long val=0;
        newmap.put(nums[0],1);
        for(int i=1;i<nums.length-1;i++){
            map.put(nums[i],map.get(nums[i])-1);
            if(map.containsKey(nums[i]*2) && newmap.containsKey(nums[i]*2)){
                long left = newmap.get(nums[i]*2);
                long right = map.get(nums[i]*2);
                val = (left*right)%MOD;
                ans=(ans+val)%MOD;
            }   
            if(map.get(nums[i])==0) map.remove(nums[i]);
            newmap.put(nums[i],newmap.getOrDefault(nums[i],0)+1);
        }
        return (int)(ans%MOD);
    }
}