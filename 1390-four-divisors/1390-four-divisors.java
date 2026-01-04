class Solution {
    public int check(int num){
        int ans=0;
        int sum=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                ans+=1;
                if(i!=num/i){
                    ans+=1;
                    sum+=num/i;
                }
            }
        }
        if(ans==4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int num:nums){
            // if(!map.containsKey(num)) map.put(num,check(num));
            ans+=check(num);
        }
        return ans;
    }
}