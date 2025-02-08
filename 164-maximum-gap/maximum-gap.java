class Solution {
    public int maximumGap(int[] nums) {
        int c=0,g=nums.length,f=Integer.MIN_VALUE;
        if(g<2)
            return 0;
        Arrays.sort(nums);
        for(int i=0;i<g-1;i++){
            c = nums[i+1] - nums[i];
            if(c>f)
                f=c;
        }return f;
    }
}