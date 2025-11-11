class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int z=0;
        int o=0; 
        for(int num:nums) if(num==1) o++;
        int arr[] = new int[nums.length+1];
        arr[0]=o;
        int idx=1;
        int max=arr[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) o--;
            arr[idx++]=(z+o);
            if((z+o)>max) max=z+o;
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++) if(arr[i]==max) li.add(i);
        return li;
    }
}