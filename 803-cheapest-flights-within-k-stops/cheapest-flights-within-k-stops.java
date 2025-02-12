class Check{
    int count;
    int node;
    int amount;
    Check(int count,int node,int amount){
        this.count=count;
        this.node=node;
        this.amount=amount;
    }
}
class Pair{
    int dest;
    int amount;
    Pair(int dest,int amount){
        this.dest=dest;
        this.amount=amount;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++){
            int srcs = flights[i][0];
            int dests = flights[i][1];
            int amount = flights[i][2];
            adj.get(srcs).add(new Pair(dests,amount));
        }
        int level=1;
        Queue<Check> queue = new LinkedList<>();
        queue.offer(new Check(0,src,0));
        int visited[] = new int[n];
        Arrays.fill(visited,100000);
        visited[src]=0;
        while(!queue.isEmpty()){
            Check value = queue.poll();
            int cnt = value.count;
            int val = value.node;
            int money = value.amount;
            if(val==dst){
               if(cnt-1<=k) ans=Math.min(ans,money);
            }
            ArrayList<Pair> answ = adj.get(val);
            for(int i=0;i<answ.size();i++){
                Pair a = answ.get(i);
                int nextnode = a.dest;
                int amo = a.amount;
                if(money+amo<visited[nextnode]){
                    visited[nextnode]=money+amo;
                    queue.offer(new Check(cnt+1,nextnode,visited[nextnode]));
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}