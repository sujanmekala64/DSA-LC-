class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int arr[]= new int[nums.length+1];
        int idx=0;
        int maxi=-1;
        while(idx<=nums.length){
            int sumleft=0;
            int sumright=0;
            for(int i=0;i<idx;i++){
                if(nums[i]==0) sumleft++;
            }
            for(int i=idx;i<nums.length;i++){
                if(nums[i]==1) sumright++;
            }
            arr[idx]=sumleft+sumright;
            maxi=Math.max(maxi,arr[idx]);
            idx++;
        }
        for(int i=0;i<=nums.length;i++){
            if(arr[i]==maxi) li.add(i);
        }
        return li;
    }
}