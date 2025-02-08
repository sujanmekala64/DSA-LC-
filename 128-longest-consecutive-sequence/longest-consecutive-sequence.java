class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int longest = 0;
        int lastnumber = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastnumber){
                count++;
                lastnumber=nums[i];
            }
            else if(nums[i]!=lastnumber){
                count=1;
                lastnumber=nums[i];
            }
            longest = Math.max(count,longest);
        }
        return longest;
    }
}