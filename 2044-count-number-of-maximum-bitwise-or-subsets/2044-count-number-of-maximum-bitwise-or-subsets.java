class Solution {
    // public int findMaxor(int nums[],int idx,int val){
    //     if(idx==nums.length){
    //         return val;
    //     }
    //     int notinc = findMaxXor(nums,idx+1,val);
    //     int inc = findMaxXor(nums,idx+1,val|nums[idx]);
    //     return Math.max(notinc,inc);
    // }
    public int findCount(int nums[],int idx,int val,int req){
        if(idx==nums.length){
            if(val==req) return 1;
            return 0;
        }
        int notinc = findCount(nums,idx+1,val,req);
        int inc = findCount(nums,idx+1,val|nums[idx],req);
        return notinc+inc;
    }
    public int countMaxOrSubsets(int[] nums) {
        // int maxxor=findMaxXor(nums,0,0);
        int maxor=0;
        for(int num:nums) maxor|=num;
        return findCount(nums,0,0,maxor);
    }
}