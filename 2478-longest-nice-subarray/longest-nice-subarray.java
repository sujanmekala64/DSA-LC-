class Solution {
    public int longestNiceSubarray(int[] nums) {
        int size=1;
        for(int i=0;i<nums.length;i++){
            int currsum=nums[i];
            int xorsum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                currsum+=nums[j];
                xorsum^=nums[j];
                if(currsum==xorsum) size=Math.max(size,j-i+1);
                else break;
            }
        }
        return size;
    }
}