class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        int maxi=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            while(((long)nums[j]*k)<(long)nums[i]){
                j++;
            }
            maxi=Math.max(maxi,i-j+1);
        }
        return nums.length-maxi;
    }
}