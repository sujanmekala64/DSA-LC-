class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int ans[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        int idx=0;
        for(int i=0;i<nums.length/3;i++){
            for(int j=0;j<3;j++){
                if(j==0 && nums[idx+2]-nums[idx]>k){
                    return new int[][]{};
                }
                ans[i][j]=nums[idx++];
            }
        }
        return ans;
    }
}