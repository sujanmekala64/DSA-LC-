class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        int ans=0;
        if(map.size()==nums.length) return 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
            }
            if((i+1)%3==0){
                ans++;
                if(map.size()==nums.length-i-1) return ans;
            }
        }
        return ans+1;
    }
}