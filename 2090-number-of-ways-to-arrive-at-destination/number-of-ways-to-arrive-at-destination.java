class Pair{
    int dest;
    long wt;
    Pair(int dest,long wt){
        this.dest=dest;
        this.wt=wt;
    }
}
class Solution {
    private int MOD = (int)(1e9+7);
    public int countPaths(int n, int[][] roads) {
        int ways[] = new int[n]; //if dist is same we increase by 1
        long dist[] = new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        ways[0]=1;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<roads.length;i++){
            int src = roads[i][0];
            int dest = roads[i][1];
            int wt = roads[i][2];
            adj.get(src).add(new Pair(dest,wt));
            adj.get(dest).add(new Pair(src,wt));
        }
        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->(int)(a.wt-b.wt));
        queue.offer(new Pair(0,0));
        while(!queue.isEmpty()){
            int na = queue.size();
            while(na!=0){
                Pair val = queue.poll();
                int des = val.dest;
                long weight = val.wt;
                ArrayList<Pair> li = adj.get(des);
                for(int i=0;i<li.size();i++){
                    Pair answ = li.get(i);
                    int destnode = answ.dest;
                    long destwt = answ.wt;
                    if(destwt+weight==dist[destnode]){
                        ways[destnode]=(ways[destnode]+ways[des])%MOD;
                    } 
                    else if(destwt+weight<dist[destnode]){
                        dist[destnode]=destwt+weight;
                        ways[destnode]=ways[des];
                        queue.offer(new Pair(destnode,dist[destnode]));
                    }
                }
                na--;
            }
        }
        return ways[n-1]%MOD;
    }
}