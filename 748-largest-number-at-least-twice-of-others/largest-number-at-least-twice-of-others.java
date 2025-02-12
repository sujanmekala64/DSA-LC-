class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-2;
        int id=-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>max){
                smax=max;
                max=val;
                id=i;
            }
            else if(val>smax && val!=max){
                smax=val;
            }
        }
        if(max>=2*smax) return id;
        return -1;
    }
}