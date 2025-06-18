class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) li.add(i);
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if((queries[i]-1)<li.size()) ans[i]=li.get(queries[i]-1);
            else ans[i]=-1;
        }
        return ans;
    }
}