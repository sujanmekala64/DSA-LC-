class Solution {
    public boolean checks(int start,int cols[],int graph[][],ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        cols[start]=0;
        while(!queue.isEmpty()){
            int f = queue.size();
            while(f!=0){
                int val = queue.poll();
                ArrayList<Integer> li = adj.get(val);
                for(int i=0;i<li.size();i++){
                    int child = li.get(i);
                    if(cols[child]==-1){
                        cols[child]=1-cols[val];
                        queue.add(child);
                    }
                    else if(cols[child]==cols[val]) return false;
                }
                f--;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); //you can directly use graph[][] instead of using adjacency matrix
        int n = graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                int nf = graph[i][j];
                adj.get(i).add(nf);
            }
        }
        int cols[] = new int[n]; // first we keep -1 and then  the 2 colors we keep as 0 and 1
        Arrays.fill(cols,-1);
        for(int i=0;i<n;i++){
            if(cols[i]==-1){
                if(checks(i,cols,graph,adj)==false) return false;
            }
        }
        return true;
    }
}