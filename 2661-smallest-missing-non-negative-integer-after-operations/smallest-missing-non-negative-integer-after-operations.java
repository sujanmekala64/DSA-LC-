class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int mod=nums[i]%value;
            if(mod<0) mod=mod+value;
            if(!map.containsKey(mod)) map.put(mod,1);
            else map.put(mod,map.get(mod)+1);
        }
        for(int i=0;i<nums.length;i++){
            int mod=i%value;
            if(map.containsKey(mod)){
                map.put(mod,map.get(mod)-1);
                if(map.get(mod)==0) map.remove(mod);
            }
            else return i;
        }
        return nums.length;
    }
}