class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void check(int nums[],int idx,List<Integer> li){
        if(idx==nums.length){
            ans.add(new ArrayList<>(li));
            return ;
        }
        check(nums,idx+1,li);
        li.add(nums[idx]);
        check(nums,idx+1,li);
        li.remove(li.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        check(nums,0,new ArrayList<>());
        return ans;
    }
}