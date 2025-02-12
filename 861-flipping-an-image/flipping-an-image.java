class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length,c=image[0].length,f=0,s=0;
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++){
            int a=0;
            for(int j=c-1;j>=0;j--){
                arr[s][a] = image[i][j];
                if(arr[s][a]==1)
                    arr[s][a]=0;
                else
                    arr[s][a]=1;
                a++;
            }
            s++;
        }
        return arr;
    }
}