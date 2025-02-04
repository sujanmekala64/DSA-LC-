class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void permut(int nums[],List<Integer> li,HashSet<List<Integer>> set){
        if(nums.length==0){
            if(!set.contains(li)){
                set.add(li);
                ans.add(new ArrayList<>(li));
                return ;
            }
        }
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            li.add(nums[i]);
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<nums.length;j++) temp.add(nums[j]);
            temp.remove(Integer.valueOf(val));
            int newarr[] = new int[temp.size()];
            for(int k=0;k<temp.size();k++) newarr[k]=temp.get(k);
            permut(newarr,li,set);
            li.remove(li.size()-1); //backtracking
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        permut(nums,li,set);
        return ans;
    }
}