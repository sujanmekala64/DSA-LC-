class Solution {
    public int maxDigitRange(int[] nums) {
        int big=0;
        int g=0;
        int mini=0,maxi=0;
        int ans[] = new int[nums.length];
        int idx=0;
        for(int num:nums){
            maxi=-1;
            mini=1000;
            while(num>0){
                g=num%10;
                num/=10;
                if(g<mini) mini=g;
                if(g>maxi) maxi=g;
            }
            ans[idx]=maxi-mini;
            big=Math.max(big,ans[idx]);
            idx++;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(ans[i]==big) sum+=nums[i];
        }
        return sum;
    }
}