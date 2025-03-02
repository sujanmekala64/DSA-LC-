class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int[] val:nums1){
            map.put(val[0],val[1]);
        }
        for(int val[]:nums2){
            if(!map.containsKey(val[0])) map.put(val[0],val[1]);
            else map.put(val[0],map.get(val[0])+val[1]);
        }
        int nums[][] = new int[map.size()][2];
        int idx=0;
        for(int keys:map.keySet()){
            nums[idx][0]=keys;
            nums[idx][1]=map.get(keys);
            idx++;
        }
        return nums;
    }
}