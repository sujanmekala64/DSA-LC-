class Solution {
    public int maximumLength(int[] nums) {
        int even=0;
        int odd=0;
        int flag=nums[0]%2;
        int both=1;
        for(int num:nums){
            if(num%2==0) even++;
            else if(num%2==1) odd++;
            if(num%2!=flag){
                flag=1-flag;
                both++;
            }
        }
        return Math.max(both,Math.max(even,odd));
    }
}