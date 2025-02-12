class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<timePoints.size();i++){
            String s1 = timePoints.get(i);
            int h1 = Integer.parseInt(s1.substring(0,2));
            int m1 = Integer.parseInt(s1.substring(3,5));
            int a = (h1*60)+m1;
            li.add(a);
        }
        int res = Integer.MAX_VALUE;
        Collections.sort(li);
        for(int i=1;i<li.size();i++){
            res = Math.min(res,li.get(i)-li.get(i-1));
        }
        res = Math.min(res,1440+li.get(0)-li.get(li.size()-1));
        return res;
    }
}