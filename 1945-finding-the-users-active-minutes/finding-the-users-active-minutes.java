class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,List<Integer>> li = new HashMap<>();
        for(int i=0;i<logs.length;i++){
            int start = logs[i][0];
            int end = logs[i][1];
            if(!li.containsKey(start)){
                li.put(start,new ArrayList<>());
                li.get(start).add(end);
            }
            else if(!li.get(start).contains(end)) li.get(start).add(end);
        } 
        int ans[] = new int[k];
        for(int key:li.keySet()){
            int val=li.get(key).size()-1;
            if(val!=-1) ans[val]++;
        }
        return ans;
    }
}