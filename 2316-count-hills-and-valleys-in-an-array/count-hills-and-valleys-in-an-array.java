class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]) li.add(nums[i]);
        }
        int cnt=0;
        for(int i=1;i<li.size()-1;i++){
            if(li.get(i-1)>li.get(i) && li.get(i+1)>li.get(i)) cnt++;
            else if(li.get(i-1)<li.get(i) && li.get(i+1)<li.get(i)) cnt++;
        }
        return cnt;
    }
}