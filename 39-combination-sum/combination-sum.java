class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void helper(int arr[],int idx,int target,List<Integer> li){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(li));
            }
            return ;
        }
        helper(arr,idx+1,target,li);
        if(arr[idx]<=target){
            li.add(arr[idx]);
            helper(arr,idx,target-arr[idx],li);
            li.remove(li.size()-1);
        }
        return ;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       helper(candidates,0,target,new ArrayList<>());
       return ans;
    }
}