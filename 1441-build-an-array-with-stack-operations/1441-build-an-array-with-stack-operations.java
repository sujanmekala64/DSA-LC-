class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx=0;
        for(int i=1;i<=n;i++){
            if(target[idx]==i){
                idx++;
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            if(idx>=target.length) return ans;
        }
        return ans;
    }
}