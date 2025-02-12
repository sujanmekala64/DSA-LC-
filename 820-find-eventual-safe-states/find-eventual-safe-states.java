class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adjreverselist = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adjreverselist.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adjreverselist.get(graph[i][j]).add(i);
            }
        }
        int indegree[] = new int[graph.length];
        for(int i=0;i<adjreverselist.size();i++){
            for(int j=0;j<adjreverselist.get(i).size();j++){
                indegree[adjreverselist.get(i).get(j)]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(indegree[i]==0) queue.offer(i);
        }
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            int element = queue.poll();
            ans.add(element);
            List<Integer> vals = adjreverselist.get(element);
            for(int i=0;i<vals.size();i++){
                indegree[vals.get(i)]--;
                if(indegree[vals.get(i)]==0) queue.offer(vals.get(i));
            }
        }  
        Collections.sort(ans);
        return ans;
    }
}