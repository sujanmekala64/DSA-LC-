class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int idx1=0;
        int idx2=0;
        int idx=0;
        while(idx1<m && idx2<n){
            if(nums1[idx1]<nums2[idx2]){
                arr[idx]=nums1[idx1]; 
                idx1++;  
            }
            else{
                System.out.println("2 "+idx2+" "+idx+" "+nums2[idx2]);
                arr[idx]=nums2[idx2];
                idx2++;
            }
            idx++;
        }
        while(idx1<m){
            arr[idx++]=nums1[idx1++];
        }
        while(idx2<n){
            arr[idx++]=nums2[idx2++];
        }
        for(int i=0;i<nums1.length;i++) nums1[i]=arr[i];
    }
}