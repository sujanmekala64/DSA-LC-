class Solution {
    public void dfs(int val,boolean vis[],List<List<Integer>> adj){
        if(!vis[val]){
            List<Integer> li = adj.get(val);
            vis[val]=true;
            for(int i=0;i<li.size();i++){
                int a = li.get(i);
                dfs(a,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i+1).add(j+1);
                    adj.get(j+1).add(i+1);
                }
            }
        }
        int cnt=0;
        boolean vis[] = new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,vis,adj);
            }
        }
        return cnt;
    }
}