class Solution {
    public int smallestNumber(int n) {
        int power=1;
        while((int)Math.pow(2,power)<=n) power++;
        return (int)Math.pow(2,power)-1;
    }
}