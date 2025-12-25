class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int idx=happiness.length-1;
        int cnt=0;
        while(k>0){
            if(happiness[idx]-cnt>0) ans+=happiness[idx]-cnt;
            idx--;
            k--;
            cnt++;
        }
        return ans;
    }
}