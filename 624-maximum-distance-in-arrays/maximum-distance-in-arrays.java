class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int mini = arrays.get(0).get(0);
        int maxi = arrays.get(0).get(arrays.get(0).size()-1);
        int maxdis = 0;
        for(int i=1;i<arrays.size();i++){
            maxdis = Math.max(maxdis,Math.abs(maxi-arrays.get(i).get(0)));
            maxdis = Math.max(maxdis,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-mini));
            mini = Math.min(mini,arrays.get(i).get(0));
            maxi = Math.max(maxi,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return maxdis;
    }
}