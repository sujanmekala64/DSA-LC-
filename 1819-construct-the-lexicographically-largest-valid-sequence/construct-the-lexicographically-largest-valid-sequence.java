class Solution {
    public boolean check(int n,int idx,boolean used[],int ans[]){
        if(idx>=ans.length) return true;
        if(ans[idx]!=0) return check(n,idx+1,used,ans);
        for(int i=n;i>=1;i--){
            if(used[i]==true) continue;
            used[i]=true;
            ans[idx]=i;
            if(i==1 && check(n,idx+1,used,ans)) return true;
            else if(i>1 && i+idx<2*n-1 && ans[i+idx]==0){
                ans[i+idx]=i;
                // used[i]=false;
                if(check(n,idx+1,used,ans)) return true;
                ans[i+idx]=0;
                // used[i]=true;
            }
            used[i]=false;
            ans[idx]=0;
        }
        return false;
    }
    public int[] constructDistancedSequence(int n) {
        int tot=2*n-1;
        int ans[]=new int[tot];
        boolean used[] = new boolean[n+1];
        check(n,0,used,ans);
        return ans;
    }
}