class Solution {
    public boolean check(int idx,String str,int targetsum){
        if(idx==str.length()){
            return targetsum==0;
        }
        int sum=0;
        for(int i=idx;i<str.length();i++){
            sum=sum*10+(str.charAt(i)-'0');
            if(sum>targetsum) break;
            if(check(i+1,str,targetsum-sum)) return true;
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            String str = Integer.toString(i*i);
            if(check(0,str,i)){
                System.out.println(i);
                ans+=i*i;
            }
        }
        return ans;
    }
}