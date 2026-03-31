class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double vals[] = new double[dist.length];
        for(int i=0;i<dist.length;i++){
            vals[i]=(double)dist[i]/speed[i];
        }
        for(int i=0;i<vals.length;i++) System.out.print(vals[i]+" ");
        Arrays.sort(vals);
        int ans=0;
        for(int i=0;i<vals.length;i++){
            if(vals[i]<=i) break;
            ans++;
        }
        return ans;
    }
}