class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length*grid[0].length;
        int arr[] = new int[n];
        int idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[idx]=grid[i][j];
                idx++;
            }
        }
        Arrays.sort(arr);
        int val=arr[n/2];
        int index=0;
        int cnt=0;
        while(index<n){
            while(arr[index]<val){
                cnt++;
                arr[index]+=x;
            }
            while(arr[index]>val){
                cnt++;
                arr[index]-=x;
            }
            if(arr[index]!=val) return -1;
            index++;
        }
        return cnt;
    }
}