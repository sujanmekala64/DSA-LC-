class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int arr[] = new int[n];
        for(int i=0;i<code.length;i++){
            int f=k;
            int sum=0;
            if(f<0){
                int start=i-1;
                while(f<0){
                    int idx=(start+n)%n;
                    sum+=code[idx];
                    start--;
                    f++;
                }
            }
            else{
                int start=i+1;
                while(f>0){
                    int idx=(start+n)%n;
                    sum+=code[idx];
                    start++;
                    f--;
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}