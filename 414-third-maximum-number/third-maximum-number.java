class Solution {
    public int max(int arr[]){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public int thirdMax(int[] nums) {
        if(nums.length<3) return max(nums);
        TreeSet<Integer> map = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        if(map.size()<3) return max(nums);
        int cnt=1;
        int third=-1;
        for(Integer it:map){
            if(cnt==3) third=it;
            cnt++;
        }
        return third;
    }
}
// class Solution {
//     public int thirdMax(int[] nums) {
//        long m=Long.MIN_VALUE;
//        long m2=Long.MIN_VALUE;
//        long m3=Long.MIN_VALUE;
//        for(int v:nums){
//             if(v>m){
//                 m3=m2;
//                 m2=m;
//                 m=v;
//             }
//             else if(v<m && v>m2){
//                 m3=m2; 
//                 m2=v;
//             }
//             else if(v<m2 && v>m3) {
//                 m3=v;
//             }
//        }
//        return (int) (m3!=Long.MIN_VALUE ? m3 : m);
//     }
// }