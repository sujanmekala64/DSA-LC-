class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==1){
                if(!map.containsKey(key-1)){
                    if(!map.containsKey(key+1)){
                        ans.add(key);
                    }
                }
            }
        }
        return ans;
    }
}