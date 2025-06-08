class Solution {
    public void dfs(int val,int n,List<Integer> ans){
        if(val>n) return ;
        ans.add(val);
        for(int i=0;i<=9;i++){
            dfs(val*10+i,n,ans);
        }
        return ;
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,n,ans);
        }
        return ans;
    }
}