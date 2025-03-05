class Solution {
    public long coloredCells(int n) {
        long count=1;
        long val=0;
        while(n>0){
            count+=val;
            val+=4;
            n--;
        }
        return count;
    }
}