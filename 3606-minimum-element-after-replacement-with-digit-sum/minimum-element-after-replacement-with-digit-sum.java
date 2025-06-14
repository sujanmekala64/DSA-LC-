class Solution {
    public int check(int val,int mini){
        int sum=0;
        while(val>0){
            sum+=val%10;
            if(sum>mini) return Integer.MAX_VALUE;
            val/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int val:nums){
            int ret = check(val,mini);
            if(ret<mini) mini=ret;
        }
        return mini;
    }
}