class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length+1];
        List<Integer> ans = new ArrayList<>();
        for(int num:nums) arr[num]=1;
        for(int i=1;i<=nums.length;i++) if(arr[i]==0) ans.add(i);
        return ans;
    }
}