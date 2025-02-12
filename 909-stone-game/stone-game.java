class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int l=0;
        int h=piles.length-1;
        while(l<h){
            int temp = piles[l];
            piles[l]=piles[h];
            piles[h]=temp;
            l++;
            h--;
        }
        int acnt = 0;
        int bcnt = 0;
        for(int i=0;i<piles.length;i++){
            if(i%2==0) acnt+=piles[i];
            else bcnt+=piles[i];
        }
        return acnt>bcnt;
    }
}