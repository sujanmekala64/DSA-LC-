class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int val = 0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            val=val+1;
        }
        return left<<val;
    }
}
/* let left = 5 = 101
    right = 7 = 111
    from last bit we will check if they are not equad we shift to right
    left = 101 right = 111 next left = 10 and right=11 so not equal and then 
    left = 10 and right = 11 next left = 1 and right = 1 so equa we done 3
    2 iteration it will be 1<<2 so the answer is 100 so answer is 4 */