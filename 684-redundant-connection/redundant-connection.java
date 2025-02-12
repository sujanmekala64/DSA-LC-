class Solution {
    public int findParent(int n,int roots[]){
        if(roots[n]==0) return n;
        else return findParent(roots[n],roots);
    }
    public boolean CycleDetected(int one,int two,int roots[]){
        int first = findParent(one,roots);
        int second = findParent(two,roots);
        if(first==second) return true;
        else{
            roots[second]=first;
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int roots[] = new int[edges.length+1];
        int a=-1;
        int b=-1;
        for(int i=0;i<edges.length;i++){
            int o = edges[i][0];
            int t = edges[i][1];
            if(CycleDetected(o,t,roots)){
                a=o;
                b=t;
            }
        }
        return new int[]{a,b};
    }
}