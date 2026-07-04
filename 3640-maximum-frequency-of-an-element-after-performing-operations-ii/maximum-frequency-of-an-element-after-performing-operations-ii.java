class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxi=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi) maxi=nums[i];
        }
        TreeMap<Integer,Integer> diffmap = new TreeMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=Math.max(0,nums[i]-k);
            int end=Math.min(maxi,nums[i]+k);
            diffmap.put(start,diffmap.getOrDefault(start,0)+1);
            diffmap.put(end+1,diffmap.getOrDefault(end+1,0)-1);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            diffmap.put(nums[i],diffmap.getOrDefault(nums[i],0));
        }
        int cumsum=0;
        List<int[]> li = new ArrayList<>();
        for(int key:diffmap.keySet()){
            li.add(new int[]{key,diffmap.get(key)+cumsum});
            cumsum+=diffmap.get(key);
        }
        int cnt=0;
        int val1=0,val2=0;
        int ans=1;
        for(int i=0;i<li.size();i++){
            cnt=0;
            val1=li.get(i)[0];
            val2=li.get(i)[1];
            if(map.containsKey(val1)) cnt=map.get(val1);
            int req=Math.abs(cnt-val2);
            int give=Math.min(numOperations,req);
            ans=Math.max(ans,give+cnt);
        }
        return ans;
    }
}