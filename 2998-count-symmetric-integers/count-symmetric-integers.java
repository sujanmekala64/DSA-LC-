class Solution {
    public int countsum(String s){
        int val=Integer.valueOf(s);
        int sum=0;
        while(val>0){
            sum+=val%10;
            val=val/10;
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            if(s.length()%2==1) continue;
            String start = s.substring(0,s.length()/2);
            String end = s.substring(s.length()/2,s.length());
            int cnt1=countsum(start);
            int cnt2=countsum(end);
            if(cnt1==cnt2) ans++;
        }
        return ans;
    }
}