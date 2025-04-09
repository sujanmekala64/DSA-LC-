class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(key>k && !set.contains(nums[i])){
                ans++;
                set.add(nums[i]);
            }
            else if(key<k) return -1;
        }
        return ans;
    }
}