class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int c=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(sum<=0) break;
            else c++;
            sum-=capacity[i];
        }
        return c;
    }
}