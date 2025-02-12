class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>(); //we keep track of that value to the index so if it is negative it already came there
        for(int i=0;i<nums.length;i++){
            int val = Math.abs(nums[i]);
            int idx = val-1; //index starts from 0
            if(nums[idx]<0) li.add(val);
            nums[idx]=-nums[idx]; //change to negative to keep track we already came to thaat value index
        }
        return li;
    }
}