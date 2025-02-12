class Solution {
    public int check(int start,int target){
        if(start>=target) return start-target; //since -1 we need to do those many ops
        if(target%2==0) return 1+check(start,target/2);
        else return 1+check(start,target+1);
    }
    public int brokenCalc(int startValue, int target) {
        return check(startValue,target);
    }
}