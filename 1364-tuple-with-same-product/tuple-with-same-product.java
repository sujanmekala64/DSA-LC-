class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val = nums[i]*nums[j];
                if(!map.containsKey(val)) map.put(val,1);
                else map.put(val,map.get(val)+1);
            }
        }
        for(Integer key:map.keySet()){
            int value = map.get(key);
            //for doing combinations(nC2)
            int ans = ((value*(value-1))/2); //n!/((n-2)!*2!) => (n*(n-1))/2
            cnt+=8*ans;
        }
        return cnt;
    }
}