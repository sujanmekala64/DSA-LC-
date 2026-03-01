class Solution {
    public int minPartitions(String n) {
        int maxi=-1;
        int idx=n.length()-1;
        while(idx>=0){
            if(n.charAt(idx)-'0'>maxi) maxi=n.charAt(idx)-'0';
            idx--;
        }
        return maxi;
    }
}