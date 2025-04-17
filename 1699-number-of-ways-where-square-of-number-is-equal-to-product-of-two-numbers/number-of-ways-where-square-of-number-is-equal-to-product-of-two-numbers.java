class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        HashMap<Long,Integer> nums1sqr = new HashMap<>();
        HashMap<Long,Integer> nums2sqr = new HashMap<>();
        for(int num:nums1){
            if(!nums1sqr.containsKey((long)num*num)) nums1sqr.put((long)num*num,1);
            else nums1sqr.put((long)num*num,nums1sqr.get((long)num*num)+1);
        }
        for(int num:nums2){
            if(!nums2sqr.containsKey((long)num*num)) nums2sqr.put((long)num*num,1);
            else nums2sqr.put((long)num*num,nums2sqr.get((long)num*num)+1);
        } 
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums2sqr.containsKey((long)nums1[i]*nums1[j])) ans+=nums2sqr.get((long)nums1[i]*nums1[j]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums1sqr.containsKey((long)nums2[i]*nums2[j])) ans+=nums1sqr.get((long)nums2[i]*nums2[j]);
            }
        }
        return ans;
    }
}