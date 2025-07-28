class Solution {
    int ans=0;
    public int findMaxXor(int nums[],int idx,int val){
        if(idx==nums.length){
            return val;
        }
        int notinc = findMaxXor(nums,idx+1,val);
        int inc = findMaxXor(nums,idx+1,val|nums[idx]);
        return Math.max(notinc,inc);
    }
    public void findCount(int nums[],int idx,int val,int req){
        if(idx==nums.length){
            if(val==req) ans++;
            return ;
        }
        findCount(nums,idx+1,val,req);
        findCount(nums,idx+1,val|nums[idx],req);
        return ;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxxor=findMaxXor(nums,0,0);
        System.out.println(maxxor);
        findCount(nums,0,0,maxxor);
        return ans;
    }
}