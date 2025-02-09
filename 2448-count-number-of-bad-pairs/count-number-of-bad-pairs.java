class Solution {
    public long countBadPairs(int[] nums) {
        /* badpairs = totalpairs - goodpairs
        goodpairs => j-i = nums[j]-nums[i]
                  so nums[j]-j=nums[i]-i, find values of each and get frequency */
        HashMap<Integer,Integer> map = new HashMap<>();
        long n=nums.length;
        long goodpairs=0;
        for(int i=0;i<n;i++){
            int tot = nums[i]-i;
            if(!map.containsKey(tot)) map.put(tot,1);
            else{
                goodpairs+=map.get(tot);
                map.put(tot,map.get(tot)+1);
            }
        }
        long totalpairs = (long)((n*(n-1)/2));
        System.out.println(totalpairs+" "+goodpairs);
        return totalpairs-goodpairs;
    }
}