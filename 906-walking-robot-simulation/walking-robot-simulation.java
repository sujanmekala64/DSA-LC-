class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int obs[]:obstacles){
            int xs=obs[0];
            int ys=obs[1];
            if(!map.containsKey(xs)) map.put(xs,new ArrayList<>());
            map.get(xs).add(ys);
        }
        int dx=0;
        int dy=1; //since facing north
        int x=0;
        int y=0; //start values (0,0)
        int ans=0;
        for(int cmd:commands){
            if(cmd==-1){
                int temp=dx;
                dx=dy;
                dy=-temp;
            }
            else if(cmd==-2){
                int temp=dx;
                dx=-dy;
                dy=temp;
            }
            else{
                for(int i=1;i<=cmd;i++){
                    int newx = x+dx;
                    int newy = y+dy;
                    if(map.containsKey(newx) && map.get(newx).contains(newy)) break;
                    x=newx;
                    y=newy;
                }
                int cnt=x*x+y*y;
                ans=Math.max(ans,cnt);
            }
            System.out.println(cmd+" "+dx+" "+dy);
        }
        return ans;
    }
}