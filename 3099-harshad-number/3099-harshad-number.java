class Solution {
    public int count(int val){
        int sum=0;
        while(val>0){
            sum+=val%10;
            val/=10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=count(x);
        return x%sum==0?sum:-1;
    }
}