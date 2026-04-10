class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=500;
        System.out.println(map);
        for(int key:map.keySet()){
            List<Integer> li = map.get(key);
            if(li.size()>2){
                for(int i=2;i<li.size();i++){
                    ans=Math.min(ans,2*(li.get(i)-li.get(i-2)));
                }
            }
        }
        return ans==500?-1:ans;
    }
}