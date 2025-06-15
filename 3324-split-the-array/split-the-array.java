class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int arr[] = new int[101];
        for(int num:nums){
            arr[num]++;
            if(arr[num]>2) return false;
        }
        return true;
    }
}