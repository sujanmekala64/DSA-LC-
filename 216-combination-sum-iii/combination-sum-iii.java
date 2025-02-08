class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void check(int arr[],int idx,int k,List<Integer> li,int target){
        if(k==0){
            // System.out.println(li);
            if(target==0){
                ans.add(new ArrayList<>(li));
            }
            // else System.out.println("hi");
            return ;
        }
        if(target<0 || idx>arr.length-1) return ;
        check(arr,idx+1,k,li,target);
        li.add(arr[idx]);
        check(arr,idx+1,k-1,li,target-arr[idx]);
        li.remove(li.size()-1);
        // return ;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        List<Integer> li = new ArrayList<>();
        check(arr,0,k,li,n);
        return ans;
    }
}