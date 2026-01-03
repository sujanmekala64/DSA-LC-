class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:friends) set.add(val);
        int ans[] = new int[friends.length];
        int idx=0;
        for(int val:order){
            if(set.contains(val)) ans[idx++]=val;
        }
        return ans;
    }
}