class Solution {
    public int max(int piles[]){
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>piles[i-1]){
                if(piles[i]>max) max=piles[i];
            }
        }
        return max;
    }
    public int check(int mid,int piles[]){
        int c=0;
        for(int i=0;i<piles.length;i++){
            c += Math.ceil((double)piles[i]/(double)mid);
        }
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        int min=100;
        while(low<=high){
            int mid = (low+high)/2;
            int ch = check(mid,piles);
            if(ch<=h){
                min=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return min;
    }
}