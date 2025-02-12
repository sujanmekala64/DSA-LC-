class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        boolean vis[] = new boolean[rooms.size()];
        queue.offer(0);
        while(!queue.isEmpty()){
            int x=queue.poll();
            for(int i:rooms.get(x)){
                if(!vis[i]) queue.offer(i);
            }
            vis[x]=true;
        }
        for(boolean i:vis) if(!i) return false;
        return true;
    }
}