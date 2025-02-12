class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
        for(int num:nums1) unique.add(num);
        List<Integer> li = new ArrayList<>();
        for(int num:nums2){
            if(unique.contains(num)){
                li.add(num);
            }
            unique.remove(num);
        }
        int arr[] = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}