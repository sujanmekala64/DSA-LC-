class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,f=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[f]=nums[i];
                f++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[f]=nums[i];
                f++;
            }
        }
        return arr;
    }
}