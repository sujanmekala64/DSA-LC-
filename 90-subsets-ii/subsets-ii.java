class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void checksubsets(int nums[],int i,List<Integer> li,HashSet<List<Integer>> set){
        if(i==nums.length){
            if(!set.contains(li)){
                Collections.sort(li);
                set.add(li);
                ans.add(new ArrayList<>(li));
            }
            return ;
        }
        //add to list
        li.add(nums[i]);
        checksubsets(nums,i+1,li,set);
        //dont add to list
        li.remove(li.size()-1);
        checksubsets(nums,i+1,li,set);
        return ;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        checksubsets(nums,0,li,set);
        return ans;
    }
}