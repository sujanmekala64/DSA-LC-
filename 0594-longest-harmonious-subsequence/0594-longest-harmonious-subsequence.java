class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        String prev=null;
        int first=0;
        int ans=0;
        for(int key:map.keySet()){
            if(prev!=null){
                if(key-first==1){
                    int cnt=map.get(first)+map.get(key);
                    if(cnt>ans) ans=cnt;
                }
            }
            else prev=" ";
            first=key;
        }
        return ans;
    }
}