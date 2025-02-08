class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                i += 2;
                c = i;
                System.out.println(i);
            }
            else{
                c = i-1;
                break;
            }   
        }
        return nums[c];
    }
}