class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void check(int candidates[],int target,int idx,List<Integer> li){
        if(target<0) return ;
        if(target==0){
            if(!ans.contains(li)) ans.add(new ArrayList<>(li));
            return ;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i-1]==candidates[i]) continue;
            if(candidates[i]>target) break;
            li.add(candidates[i]);
            check(candidates,target-candidates[i],i+1,li);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        check(candidates,target,0,new ArrayList<>());
        return ans;
    }
}