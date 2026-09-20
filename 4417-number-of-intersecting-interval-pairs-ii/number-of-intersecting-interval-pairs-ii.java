class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        List<int[]> li = new ArrayList<>();
        for(int inte[]:intervals){
            li.add(new int[]{inte[0],1});
            li.add(new int[]{inte[1],-1});
        }
        Collections.sort(li,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1],a[1]);
        });
        long ans=0;
        long cnt=0;
        for(int val[]:li){
            if(val[1]==1){
                ans+=cnt;
                cnt++;
            }
            else cnt--;
        }
        return ans;
    }
}