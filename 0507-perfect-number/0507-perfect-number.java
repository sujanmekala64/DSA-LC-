class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
            return false;
        int c=0,f=0;
        int x=(int)Math.sqrt(num);
        for(int i=2;i<=x;i++){
            if(num%i==0){
                c+=i+(num/i);
            }
        }
        return c==num-1?true:false;
    }
}