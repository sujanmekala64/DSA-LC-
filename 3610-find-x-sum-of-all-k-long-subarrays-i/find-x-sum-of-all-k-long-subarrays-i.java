class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }
            else{
                return b.getKey()-a.getKey();
            }
        });
        int temp=0;
        int tot=0;
        for(Map.Entry<Integer, Integer> entry : list) {
            if(tot==x){
                break;
            }
            temp+=entry.getKey()*entry.getValue();
            tot++;
        }
        int index=0;
        ans[index++]=temp;
        int idx=k;
        int start=0;
        while(idx<nums.length){
            if(nums[idx]==nums[start]){
                ans[index]=ans[index-1];
            }
            else{
                temp=0;
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                if(map.get(nums[start])==0) map.remove(nums[start]);
                map.put(nums[idx],map.getOrDefault(nums[idx],0)+1);
                List<Map.Entry<Integer,Integer>> list1 = new ArrayList<>(map.entrySet());
                list1.sort((a,b)->{
                    if(!a.getValue().equals(b.getValue())){
                        return b.getValue()-a.getValue();
                    }
                    else{
                        return b.getKey()-a.getKey();
                    }
                });
                tot=0;
                for (Map.Entry<Integer, Integer> entry : list1) {
                    if(tot==x){
                        break;
                    }
                    temp+=entry.getKey()*entry.getValue();
                    tot++;
                }
                ans[index]=temp;
            }
            idx++;
            start++;
            index++;
        }
        return ans;
    }
}