class Solution {
    long ans=Integer.MAX_VALUE;
    public void check(int nums[],int idx,List<Integer> li,int size){
        if(li.size()!=0 && li.size()==size){
            System.out.println(li);
            long val=0;
            for(int i=0;i<li.size()/2;i++) val+=li.get(i);
            for(int i=li.size()/2;i<li.size();i++) val-=li.get(i);
            ans=Math.min(ans,val);
            return ;
        }
        if(idx>=nums.length) return ;
        li.add(nums[idx]);
        check(nums,idx+1,li,size);
        // size--;
        li.remove(li.size()-1);
        check(nums,idx+1,li,size);
        return ;
    }
    public long minimumDifference(int[] nums) {
        int n=nums.length/3;
        int size=nums.length-n;
        check(nums,0,new ArrayList<>(),size);
        return ans;
    }
}