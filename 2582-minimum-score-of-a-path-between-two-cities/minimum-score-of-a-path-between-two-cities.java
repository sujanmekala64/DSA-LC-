class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=1;i<=n+1;i++){
            adj.add(new ArrayList<>());
        }
        int mini=Integer.MAX_VALUE;
        for(int road[]:roads){
            adj.get(road[0]).add(new int[]{road[1],road[2]});   
            adj.get(road[1]).add(new int[]{road[0],road[2]});    
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        HashSet<Integer> set =new HashSet<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int t=0;t<size;t++){
                int val=queue.poll();
                set.add(val);
                for(int i=0;i<adj.get(val).size();i++){
                    int one = adj.get(val).get(i)[0];
                    int wei = adj.get(val).get(i)[1];
                    if(!set.contains(one)) queue.add(one);
                    mini=Math.min(mini,wei);
                }
            }
        }
        return mini;
    }
}