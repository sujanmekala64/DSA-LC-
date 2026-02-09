class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int crtidx=0;
        int temp=0;
        while(i<nums.length){
            if(nums[i]<=0 || nums[i]>nums.length){
                i++;
                continue;
            }
            crtidx=nums[i]-1;
            if(nums[i]!=nums[crtidx]){
                temp=nums[i];
                nums[i]=nums[crtidx];
                nums[crtidx]=temp;
            }
            else i++;
        }
        int ans=1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<=0){
                j++;
                continue;
            }
            if(nums[j]!=ans) return ans;
            else ans++;
        }
        return ans;
    }
}