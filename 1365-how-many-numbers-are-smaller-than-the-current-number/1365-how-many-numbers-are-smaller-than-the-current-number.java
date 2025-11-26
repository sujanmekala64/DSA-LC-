class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int vals[] = new int[501];
        Arrays.fill(vals,-1);
        int news[] = nums.clone();
        Arrays.sort(news);
        int idx=0;
        for(int num:news){
            if(vals[num]==-1){
                vals[num]=idx;
            }
            idx++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=vals[nums[i]];
        }
        return nums;
    }
}