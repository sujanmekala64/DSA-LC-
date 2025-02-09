class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int nicepairs=0;
        int MOD=1_000_000_007;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            StringBuilder sb = new StringBuilder(String.valueOf(val));
            int reverse = Integer.parseInt(sb.reverse().toString());
            int tot = val-reverse;
            if(!map.containsKey(tot)) map.put(tot,1);
            else{
                nicepairs+=map.get(tot);
                nicepairs=nicepairs%MOD;
                map.put(tot,map.get(tot)+1);
            }
        }
        return nicepairs;
    }
}