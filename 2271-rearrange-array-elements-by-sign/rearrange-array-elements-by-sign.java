class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even[] = new int[nums.length/2+1];
        int odd[] = new int[nums.length/2+1];
        int eveidx=0;
        int oddidx=0;
        for(int num:nums){
            if(num>0) even[eveidx++]=num;
            else odd[oddidx++]=num;
        }
        eveidx=0;
        oddidx=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) nums[i]=even[eveidx++];
            else nums[i]=odd[oddidx++];
        }
        return nums;
    }
}