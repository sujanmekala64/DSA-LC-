class Solution {
    public int maximumLength(int[] nums) {
        int even=0;
        int odd=0;
        int both=0;
        int ans=0;
        for(int num:nums){
            if(num%2==0) even++;
            else odd++;
        }
        int flag=nums[0]%2;
        both++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2!=flag){
                both++;
                flag=1-flag;
            }
        }
        return Math.max(both,Math.max(even,odd));
    }
}