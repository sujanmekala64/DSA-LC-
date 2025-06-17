class Solution {
    public int sum(int n){
        int add=0;
        while(n>0){
            add+=n%10;
            n/=10;
        }
        return add;
    }
    public int countLargestGroup(int n) {
        int max=0;
        int arr[] = new int[37]; //used 37 because the highest was 10 power 5, 9999 so it has sum of digits highest as 36,it cant exceed more than that for any value
        for(int i=1;i<=n;i++){
            int val=sum(i);
            arr[val]++;
            if(arr[val]>max) max=arr[val];
        }
        int cnt=0;
        for(int i=1;i<37;i++) if(arr[i]==max) cnt++;
        return cnt;
    }
}