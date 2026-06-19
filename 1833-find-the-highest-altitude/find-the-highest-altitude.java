class Solution {
    public int largestAltitude(int[] gain) {
        int maxi=0;
        int prev=0;
        for(int i=0;i<gain.length;i++){
            prev=gain[i]+prev;
            if(prev>maxi) maxi=prev;
        }
        return maxi;
    }
}