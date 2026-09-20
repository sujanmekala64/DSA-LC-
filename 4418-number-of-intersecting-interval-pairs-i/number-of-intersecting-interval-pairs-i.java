class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int ans=0;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1],a[1]);
        });
        for(int i=0;i<intervals.length;i++){
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=intervals[i][1] && intervals[i][0]<=intervals[j][0]) ans++;
            }
        }
        return ans;
        // List<int[]> li = new ArrayList<>();
        // for(int inte[]:intervals){
        //     li.add(new int[]{inte[0],1});
        //     li.add(new int[]{inte[1],-1});
        // }
        // Collections.sort(li,(a,b)->{
        //     if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
        //     return Integer.compare(b[1],a[1]);
        // });
        // int ans=0;
        // int cnt=0;
        // for(int val[]:li){
        //     if(val[1]==1){
        //         ans+=cnt;
        //         cnt++;
        //     }
        //     else cnt--;
        // }
        // return ans;
    }
}