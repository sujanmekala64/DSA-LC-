class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,cnt1=0,cnt2=0; //cnt1 && cnt2 r respective zeroes count of nums1 & nums2
        for(int num:nums1){
            sum1+=num;
            if(num==0) cnt1++;
        }
        for(int num:nums2){
            sum2+=num;
            if(num==0) cnt2++;
        }
        if(cnt2==0) if(sum1+cnt1>sum2) return -1;
        if(cnt1==0) if(sum2+cnt2>sum1) return -1;
        long val1 = sum2+cnt2;
        long val2 = sum1+cnt1;
        return Math.max(val1,val2);
    }
}