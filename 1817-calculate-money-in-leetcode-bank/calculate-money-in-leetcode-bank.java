class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int start=1;
        int sum=28;
        while(n>=7){
            ans+=sum;
            sum-=start;
            sum+=(7+start);
            start++;
            n-=7;
        }
        // System.out.println(sum);
        while(n>0){
            ans+=start;
            start++;
            n--;
        }
        return ans;
    }
}