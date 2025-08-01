class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            leftsum[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            rightsum[i]=sum;
            sum+=nums[i];
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=((nums[i]*i)-leftsum[i])+(rightsum[i]-(nums[i]*(n-i-1)));
        }
        return ans;
    }
}