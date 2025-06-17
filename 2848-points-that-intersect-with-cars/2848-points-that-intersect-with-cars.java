class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int maxi=0;
        for(int i=0;i<nums.size();i++){
            int val1 = nums.get(i).get(0);
            int val2 = nums.get(i).get(1);
            if(val1>maxi) maxi=val1;
            if(val2>maxi) maxi=val2;
        }
        int diff[] = new int[maxi+2];
        for(int i=0;i<nums.size();i++){
            int val1 = nums.get(i).get(0);
            int val2 = nums.get(i).get(1);
            diff[val1]++;
            diff[val2+1]--;
        }
        for(int i=1;i<maxi+2;i++) diff[i]+=diff[i-1];
        int ans=0;
        for(int i=0;i<=maxi;i++) if(diff[i]>0) ans++;
        return ans;
    }
}