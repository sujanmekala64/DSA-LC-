class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int start=-1;
        for(int i=0;i<adjacentPairs.length;i++){
            int val1 = adjacentPairs[i][0];
            int val2 = adjacentPairs[i][1];
            if(!map.containsKey(val1)) map.put(val1,new ArrayList<>());
            if(!map.containsKey(val2)) map.put(val2,new ArrayList<>());
            map.get(val1).add(val2);
            map.get(val2).add(val1);
        }
        for(int i=0;i<adjacentPairs.length;i++){
            int val1 = adjacentPairs[i][0];
            int val2 = adjacentPairs[i][1];
            if(map.get(val1).size()==1){
                start=val1;
                break;
            }
            if(map.get(val2).size()==1){
                start=val2;
                break;
            }
        }
        int idx=0;
        int ans[] = new int[map.size()];
        while(map.size()>0){
            ans[idx++]=start;
            List<Integer> li = map.get(start);
            map.remove(start);
            for(int i=0;i<li.size();i++){
                if(map.containsKey(li.get(i))) start=li.get(i);
            }
        }
        return ans;
    }
}