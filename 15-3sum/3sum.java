class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       if(nums.length<3) return ans;
       for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<0){
            j++;
        }
        else if(sum>0){
            k--;
        }
        else if(sum==0){
            List<Integer> li = new ArrayList<>();
            li.add(nums[i]);
            li.add(nums[j]);
            li.add(nums[k]);
            j++;
            k--;
            ans.add(new ArrayList<>(li));
            while(j<k && nums[j-1]==nums[j]) j++;
            while(j<k && nums[k+1]==nums[k]) k--;
        }
        }
       }
       return ans;
    }
}