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
        int median=arr[n/2];
        int cnt=0;
        for(int num:arr){
            if(num==median) continue;
            if(Math.abs(num-median)%x!=0) return -1;
            cnt+=Math.abs(num-median)/x;
        }
        // while(index<n){
        //     while(arr[index]<val){
        //         cnt++;
        //         arr[index]+=x;
        //     }
        //     while(arr[index]>val){
        //         cnt++;
        //         arr[index]-=x;
        //     }
        //     if(arr[index]!=val) return -1;
        //     index++;
        // }
        return cnt;
    }
}