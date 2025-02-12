class Solution {
    public int great(int nums2[],int n,int val){
        for(int i=n+1;i<nums2.length;i++){
            if(nums2[i]>val) return nums2[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            int r = great(nums2,i,nums2[i]);
            map.put(nums2[i],r);
        }
        // int nums[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=(int)map.get(nums1[i]);
            }
        }
        return nums1;
    }
}