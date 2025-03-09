class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0;
        int n=colors.length;
        for(int i=0;i<colors.length;i++){
            int j=(i+1)%n;
            int k=(i+2)%n;
            if(colors[i]!=colors[j] && colors[j]!=colors[k]) cnt++;
        }
        return cnt;
    }
}