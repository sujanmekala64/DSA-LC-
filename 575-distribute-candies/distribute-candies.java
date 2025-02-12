class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) set.add(candyType[i]);
        int val=n/2;
        return Math.min(val,set.size());
    }
}