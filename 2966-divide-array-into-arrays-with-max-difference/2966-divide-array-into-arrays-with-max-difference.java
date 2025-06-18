class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int ans[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        int idx=0;
        for(int i=0;i<nums.length/3;i++){
            if(nums[idx+2]-nums[idx]>k) return new int[][]{};
            for(int j=0;j<3;j++) ans[i][j]=nums[idx++];
        }
        return ans;
    }
}