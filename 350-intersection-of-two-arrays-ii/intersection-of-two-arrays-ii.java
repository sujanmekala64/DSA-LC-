class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for(int num:nums1) li.add(num);
        for(int num:nums2){
            if(li.contains(num)){
                ans.add(num);
                li.remove(Integer.valueOf(num));
            }
        }
        int arr[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++) arr[i]=ans.get(i);
        return arr;
    }
}