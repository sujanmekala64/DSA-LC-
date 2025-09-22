class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        for(int num:nums) arr[num]++;
        int maxfreq=-1;
        for(int num:nums){
            if(arr[num]>maxfreq) maxfreq=arr[num];
        }
        int ans=0;
        for(int num:nums){
            if(arr[num]==maxfreq) ans++;
        }
        return ans;
    }
}