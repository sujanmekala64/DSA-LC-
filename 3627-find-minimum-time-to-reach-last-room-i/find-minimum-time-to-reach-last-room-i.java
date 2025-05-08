class Solution {
    static class Node{
        int r,c,time;
        public Node(int r,int c,int time){
            this.r=r;
            this.c=c;
            this.time=time;
        }
    }
    static class Comparator implements java.util.Comparator<Node> {
        public int compare(Node p1, Node p2) {
            return Integer.compare(p1.time, p2.time);
        }
    }
    public boolean idxExsists(int r,int c,int n,int m){
        if(r<0 || r>=n || c<0 || c>=m) return false;
        return true;
    }
    public int minTimeToReach(int[][] moveTime) {
        int n=moveTime.length;
        int m=moveTime[0].length;
        boolean vis[][] = new boolean[n][m];
        PriorityQueue<Node> pq = new PriorityQueue(new Comparator());
        pq.offer(new Node(0,0,0));
        vis[0][0]=true;
        int rows[] = {0,0,1,-1};
        int cols[] = {-1,1,0,0};
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int row = node.r;
            int col = node.c;
            int t=node.time;
            if(row==n-1 && col==m-1) return t;
            for(int i=0;i<4;i++){
                int newr=row+rows[i];
                int newc=col+cols[i];
                if(idxExsists(newr,newc,n,m) && vis[newr][newc]==false){
                    Node newnode = new Node(newr,newc,1+Math.max(t,moveTime[newr][newc]));
                    pq.offer(newnode);
                    vis[newr][newc]=true;
                }
            }
        }
        return -1;
    }
}