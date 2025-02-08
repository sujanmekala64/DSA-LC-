class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = prerequisites.length;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int indegree[] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int dest = prerequisites[i][1];
            indegree[dest]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) queue.offer(i);
        }
        int cnt=0;
        while(!queue.isEmpty()){
            int a = queue.poll();
            cnt++;
            List<Integer> li = adj.get(a);
            for(int i=0;i<li.size();i++){
                int val = li.get(i);
                indegree[val]--;
                if(indegree[val]==0) queue.offer(val);
            }
        }
        return cnt==numCourses;
    }
}