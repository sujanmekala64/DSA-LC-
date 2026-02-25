class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        int cnt=0;
        for(int val:arr){
            cnt=Integer.bitCount(val);
            if(!map.containsKey(cnt)){
                map.put(cnt,new ArrayList<>());
            }
            map.get(cnt).add(val);
        }
        int idx=0;
        for(int key:map.keySet()){
            List<Integer> ans = map.get(key);
            Collections.sort(ans);
            for(int i=0;i<ans.size();i++){
                arr[idx++]=ans.get(i);
            }
        }
        return arr;
    }
}