class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[]=new int[n];
        for(int i=0;i<bookings.length;i++){
            int start=bookings[i][0]-1;
            int end=bookings[i][1]-1;
            int val=bookings[i][2];
            for(int j=start;j<=end;j++){
                arr[j]+=val;
            }
        }
        return arr;
    }
}