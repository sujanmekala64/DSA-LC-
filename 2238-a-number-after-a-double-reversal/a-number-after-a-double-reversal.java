class Solution {
    public int rev(int num){
        int rev=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
       int val1 = rev(num);
       System.out.println(val1);
       int val2 = rev(val1);
        System.out.println(val2);
       return num==val2;
    }
}