class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // int arr[] = new int[nums.length+1];
        // List<Integer> ans = new ArrayList<>();
        // for(int num:nums) arr[num]=1;
        // for(int i=1;i<=nums.length;i++) if(arr[i]==0) ans.add(i);
        // return ans;

        //cycle sort
        int i=0;
        int crtidx=0;
        int temp=0;
        while(i<nums.length){
            crtidx = nums[i]-1;
            if(nums[i]<=nums.length && nums[i]!=nums[crtidx]){
                temp=nums[i];
                nums[i]=nums[crtidx];
                nums[crtidx]=temp;
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++) if(j+1!=nums[j]) ans.add(j+1);
        return ans;
    }
}