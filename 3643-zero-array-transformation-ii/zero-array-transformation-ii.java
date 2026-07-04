class Solution {
    public boolean checkZeroes(int arr[]){
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                check=false;
                break;
            }
        }
        return check;
    }
    public boolean check(int nums[],int queries[][],int nthquery){
        int diff[] = new int[nums.length+1];
        for(int i=0;i<=nthquery;i++){
            diff[queries[i][0]]+=queries[i][2];
            diff[queries[i][1]+1]-=queries[i][2];
        }
        int n=nums.length;
        for(int i=1;i<n;i++){
            diff[i]=diff[i-1]+diff[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>diff[i]) return false;
        }
        return true;
        // if(checkZeroes(diff)) return true;
        // return false;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        if(checkZeroes(nums)) return 0;
        int l=0;
        int h=queries.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            // System.out.println(mid);
            if(check(nums,queries,mid)){
                h=mid-1;
                ans=mid+1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}