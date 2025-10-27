class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=-1;
        int ans=0;
        int tot=0;
        for(String val:bank){
            int cnt=0;
            for(char p:val.toCharArray()){
                if(p=='1') cnt++;
            }
            if(cnt>0){
                if(prev==-1) prev=cnt;
                else{
                    ans+=prev*cnt;
                    prev=cnt;
                }
                tot++;
            }
        }
       if(tot>1) return ans;
       return 0;
    }
}