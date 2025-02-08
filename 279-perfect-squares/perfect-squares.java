class Solution {
    public int numSquares(int n) {
        int arr[] = new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            int min_value=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem = i-j*j;
                min_value = Math.min(min_value,arr[rem]);
            }
            arr[i]=min_value+1;
        }
        return arr[n];
    }
}