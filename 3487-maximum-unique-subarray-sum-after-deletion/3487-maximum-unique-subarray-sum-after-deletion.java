class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxi=Integer.MIN_VALUE;
        int val=0;
        for(int num:nums){
            if(!set.contains(num)){
                val+=num;
                set.add(num);
            }
            maxi=Math.max(val,Math.max(num,maxi));
        }
        int sum=0;
        set.clear();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(num<0) continue;
            if(!map.containsKey(num)){
                map.put(num,sum);
                sum+=num;
            }
            else{
                sum=sum-map.get(num);
                map.put(num,sum);
            }
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}