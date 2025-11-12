class Solution {
    public int gcd(int a,int b){
        int val=Math.min(a,b);
        while(val>1){
            if(a%val==0 && b%val==0) return val;
            val--;
        }
        return 1;
    }
    public int minOperations(int[] nums) {
        int ones=0;
        for(int num:nums) if(num==1) ones++;
        if(ones>0) return nums.length-ones;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            for(int j=i+1;j<nums.length;j++){
                val=gcd(val,nums[j]);
                if(val==1){
                    minlen=Math.min(minlen,(j-i+1));
                    break;
                }
            }
        }
        if(minlen==Integer.MAX_VALUE) return -1;
        return nums.length+minlen-2;
    }
}