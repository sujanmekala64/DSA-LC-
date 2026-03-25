class Solution {
    public boolean checkBiPartite(List<List<Integer>> ans,int vis[],int start,int color){
        // Queue<Integer> queue = new LinkedList<>();
        // queue.offer(start);
        // vis[start]=0;
        // while(!queue.isEmpty()){
        //     int size=queue.size();
        //     while(size-->0){
        //         int val = queue.poll();
        //         int color=vis[val];
        //         List<Integer> li = ans.get(val);
        //         for(int i=0;i<li.size();i++){
        //             if(vis[li.get(i)]==-1){
        //                 queue.offer(li.get(i));
        //                 vis[li.get(i)]=1-color;
        //             }
        //             else if(vis[li.get(i)]==vis[val]) return false;
        //         }
        //     }
        // }
        // return true;
        vis[start]=color;
        List<Integer> li = ans.get(start);
        for(int i=0;i<li.size();i++){
            if(vis[li.get(i)]==-1){
                if(!checkBiPartite(ans,vis,li.get(i),1-color)) return false;
            }
            else if(vis[li.get(i)]==vis[start]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<graph.length;i++) ans.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                ans.get(i).add(graph[i][j]);
            }
        }
        int vis[] = new int[graph.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<graph.length;i++){
            if(vis[i]==-1){
                if(!checkBiPartite(ans,vis,i,0)) return false;
            }
        }
        return true;
    }
}