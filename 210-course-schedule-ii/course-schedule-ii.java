class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<prerequisites.length;i++){
            int dest = prerequisites[i][1];
            indegree[dest]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) queue.add(i);
        }
        int arr[] = new int[numCourses];
        int idx=numCourses-1;
        int cnt=0;
        while(!queue.isEmpty()){
            int val = queue.poll();
            cnt++;
            arr[idx--]=val;
            ArrayList<Integer> li = adj.get(val);
            for(int i=0;i<li.size();i++){
                int ans = li.get(i);
                indegree[ans]--;
                if(indegree[ans]==0) queue.offer(ans);
            } 
        }
        if(cnt==numCourses) return arr;
        return new int[]{};
    }
}