class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int max_left[] = new int[n];
        int max_right[] = new int[n];
        max_left[0] = nums[0];
        max_right[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            max_left[i] = (i%k==0)?nums[i]:Math.max(nums[i],max_left[i-1]);
            int j = n-i-1;
            max_right[j] = (j%k==0)?nums[j]:Math.max(nums[j],max_right[j+1]);
        }
        int ans[] = new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            ans[i] = Math.max(max_right[i],max_left[k+i-1]);
        }
        return ans;
    }
}