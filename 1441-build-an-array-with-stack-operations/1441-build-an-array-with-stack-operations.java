class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx=0;
        for(int i=1;i<=n && idx<target.length;i++){
            if(target[idx]==i){
                idx++;
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}