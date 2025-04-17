class Solution {
    public int countPairs(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                List<Integer> arr = new ArrayList<>();
                arr.add(i);
                map.put(nums[i],arr);
            }
            else{
                List<Integer> arr = map.get(nums[i]);
                for(int j=0;j<arr.size();j++) if((arr.get(j)*i)%k==0) ans++;
                arr.add(i);
                map.put(nums[i],arr);
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) if((i*j)%k==0) ans++; 
        //     }
        // }
        return ans;
    }
}