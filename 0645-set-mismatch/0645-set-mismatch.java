class Solution {
    public int[] findErrorNums(int[] nums) {
        long n=nums.length;
        long sum=0;
        long sqr=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sqr+=nums[i]*nums[i];
        }
        long orgsum = (n*(n+1))/2;
        long orgsqr= (n*(n+1)*(2*n+1))/6;
        long minus = orgsum-sum;
        long sqrminus = orgsqr-sqr;
        long plus = sqrminus/minus;
        long missing = (plus+minus)/2;
        long repeat = plus-missing;
        return new int[]{(int)repeat,(int)missing};
    }
}