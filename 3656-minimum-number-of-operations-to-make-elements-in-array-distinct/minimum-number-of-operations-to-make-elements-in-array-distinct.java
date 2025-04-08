class Solution {
    public boolean check(int idx,int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=idx+1;i<nums.length;i++){
            if(set.contains(nums[i])) return false;
            set.add(nums[i]);
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        int ans=0;
        if(check(-1,nums)) return 0;
        for(int i=0;i<nums.length;i++){
            if((i+1)%3==0){
                ans++;
                if(check(i,nums)) return ans;
            }
        }
        return ans+1;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])) map.put(nums[i],1);
        //     else map.put(nums[i],map.get(nums[i])+1);
        // }
        // int ans=0;
        // if(map.size()==nums.length) return 0;
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])-1);
        //         if(map.get(nums[i])==0) map.remove(nums[i]);
        //     }
        //     if((i+1)%3==0){
        //         ans++;
        //         if(map.size()==nums.length-i-1) return ans;
        //     }
        // }
        // return ans+1;
    }
}