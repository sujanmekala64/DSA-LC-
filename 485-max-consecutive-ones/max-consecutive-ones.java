class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,c=0,x=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                c++;
            else{
                if(c>x)
                    x=c;
                c=0;
            }
        }
        return c>x?c:x;
    }
}