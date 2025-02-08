class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int sum=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=sum;
            sum=sum*nums[i];
        }
        sum=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*sum;
            sum=sum*nums[i];
        }
        return arr;
    }
}