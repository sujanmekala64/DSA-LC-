class Solution {
    public int countDays(int days, int[][] meetings) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int start=meetings[0][0];
        int end=meetings[0][1];
        int ns=0;
        int ne=0;
        for(int i=1;i<meetings.length;i++){
            ns=meetings[i][0];
            ne=meetings[i][1];
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
        int val=0;
        for(int i=0;i<ans.size();i+=2){
            val+=ans.get(i+1)-ans.get(i)+1;
        }
        return days-val;
    }
}