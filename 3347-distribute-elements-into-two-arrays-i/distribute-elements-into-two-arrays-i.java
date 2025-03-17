class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int prev1=nums[0];
        int prev2=nums[1];
        for(int i=2;i<nums.length;i++){
            if(prev1>prev2){
                arr1.add(nums[i]);
                prev1=nums[i];
            }
            else{
                arr2.add(nums[i]);
                prev2=nums[i];
            }
        }
        int cnt=0;
        for(int i=0;i<arr1.size();i++){
            nums[i]=arr1.get(i);
            cnt++;
        }
        for(int i=0;i<arr2.size();i++){
            nums[cnt++]=arr2.get(i);
        }
        return nums;
    }
}