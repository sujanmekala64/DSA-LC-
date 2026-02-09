class Solution {
    public int findDuplicate(int[] nums) {
        // boolean arr[] = new boolean[nums.length+1];
        // for(int i=0;i<nums.length;i++){
        //     int ind = Math.abs(nums[i]);
        //     if(nums[ind]<0) return ind;
        //     nums[ind] = -nums[ind];
        // }
        // return -1;

        //cycle sort
        int i=0;
        int crtidx=0;
        int temp=0;
        while(i<nums.length){
            crtidx=nums[i]-1;
            if(nums[i]!=nums[crtidx]){
                temp=nums[i];
                nums[i]=nums[crtidx];
                nums[crtidx]=temp;
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++) if(nums[j]!=j+1) return nums[j];
        return -1;
    }
}