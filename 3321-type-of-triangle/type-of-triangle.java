class Solution {
    public boolean isTriangle(int nums[]){
        if(nums[0]<(nums[1]+nums[2])){
            if(nums[1]<(nums[0]+nums[2])){
                if(nums[2]<(nums[0]+nums[1])) return true;
            }
        }
        return false;
    }
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[1]==nums[2] && nums[2]==nums[0]) return "equilateral";
        else if(isTriangle(nums)){
            if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2]) return "scalene";
            return "isosceles";
        }
        return "none";
    }
}