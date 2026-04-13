import java.util.Random; 
class Solution {
    HashMap<Integer,List<Integer>> map;
    Random rand;
    public Solution(int[] nums) {
        map=new HashMap<>();
        rand=new Random();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> li = map.get(target);
        int idx = rand.nextInt(li.size());
        return li.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */