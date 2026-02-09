class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int crtidx = 0;
        int temp=0;
        while(i<nums.length){
            crtidx = nums[i]-1;
            if(nums[i]<=nums.length && nums[i]!=nums[crtidx]){
                temp=nums[i];
                nums[i]=nums[crtidx];
                nums[crtidx]=temp;
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++) if(nums[j]!=j+1) ans.add(nums[j]);
        return ans;
    }
}