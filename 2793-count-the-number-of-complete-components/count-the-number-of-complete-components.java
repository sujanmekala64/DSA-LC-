class Solution {
    public void CountSizeDFS(int val,List<List<Integer>> adj,List<Integer> li,int vis[]){
        if(vis[val]==1) return ;
        vis[val]=1;
        li.add(val);
        for(int vals:adj.get(val)){
            CountSizeDFS(vals,adj,li,vis);
        }
        return ;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int degree[] = new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        int vis[]=new int[n];
        int ans=0;
        boolean ch=false;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                List<Integer> li = new ArrayList<>();
                CountSizeDFS(i,adj,li,vis);
                int size=li.size()-1;
                if(degree[i]!=size) continue;
                for(int vals:adj.get(i)){
                    if(degree[vals]!=size){
                        ch=true;
                        break;
                    }
                }
                if(!ch) ans++;
                ch=false;
            }
        }
        return ans;
    }
}