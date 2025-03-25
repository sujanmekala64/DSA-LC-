class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<Integer> ans = new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        int ns=0;
        int ne=0;
        for(int i=1;i<intervals.length;i++){
            ns = intervals[i][0];
            ne = intervals[i][1];
            if(ns<=end){
                end=Math.max(end,ne);
            }
            else{
                ans.add(start);
                ans.add(end);
                start=ns;
                end=ne;
            }
        }
        ans.add(start);
        ans.add(end);
        int idx=0;
        int arr[][] = new int[ans.size()/2][2];
        for(int i=0;i<ans.size();i+=2){
            arr[idx][0]=ans.get(i);
            arr[idx][1]=ans.get(i+1);
            idx++;
        }
        return arr;
    }
}