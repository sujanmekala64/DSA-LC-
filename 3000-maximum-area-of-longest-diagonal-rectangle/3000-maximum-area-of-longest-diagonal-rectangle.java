class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0;
        int temp=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int v = (l*l)+(w*w);
            int area = (l*w);
            if(v>temp){
                temp=v;
                ans=l*w;
            }
            else if(v==temp && area>ans) ans=area;
        }
        return ans;
    }
}