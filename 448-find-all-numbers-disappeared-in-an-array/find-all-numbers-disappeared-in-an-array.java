class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean check[] = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            check[nums[i]-1] = true; 
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!check[i]) li.add(i+1);
        }
        return li;
    }
}