class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(value==0){
                map.put(0,map.getOrDefault(0,0)+1);
                continue;
            }
            int mod=nums[i]%value;
            if(mod<0) mod=mod+value;
            if(!map.containsKey(mod)) map.put(mod,1);
            else map.put(mod,map.get(mod)+1);
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(map.containsKey(0)){
                    map.put(0,map.get(0)-1);
                    if(map.get(0)==0) map.remove(0);
                    continue;
                }
                else return 0;
            }
            int mod=i%value;
            if(map.containsKey(mod)){
                map.put(mod,map.get(mod)-1);
                if(map.get(mod)==0) map.remove(mod);
            }
            else{
                return i;
            }
            System.out.println(i+" "+mod);
        }
        return nums.length;
    }
}