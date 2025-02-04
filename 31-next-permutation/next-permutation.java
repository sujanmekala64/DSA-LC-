class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int start=0;
            int end=n-1;
            while(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        else{
            for(int i=n-1;i>index;i--){
                if(nums[i]>nums[index]){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            for(int j=index+1;j<n;j++){
            int min = j;
            for(int i=j;i<n;i++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
        }
    }
}