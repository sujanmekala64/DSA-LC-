class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val = nums[i]*nums[j];
                if(!map.containsKey(val)) map.put(val,0);
                else map.put(val,map.get(val)+1);
                cnt+=8*map.get(val);
            }
        }
        return cnt;
    }
}