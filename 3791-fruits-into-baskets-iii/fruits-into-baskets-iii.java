class Solution {
    public int checkmax(int val,int maxs[]){
        for(int i=0;i<maxs.length;i++){
            if(val<=maxs[i]) return i;
        }
        return -1;
    }
    public int findMaxi(int start,int end,int baskets[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=start;i<end && i<baskets.length;i++){
            maxi=Math.max(maxi,baskets[i]);
        }
        return maxi;
    }
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=(int)(Math.sqrt(fruits.length));
        int cnt=0;
        int val=0;
        int maxs[] = new int[n+1];
        int idx=0;
        while(idx<=n){
            maxs[idx]=findMaxi(val,val+n+1,baskets);
            val+=(n+1);
            idx++;
        }
        for(int i=0;i<fruits.length;i++){
            int maxidx = checkmax(fruits[i],maxs);
            if(maxidx==-1) continue;
            for(int j=maxidx*(n+1);j<(maxidx*(n+1))+(n+1) && j<fruits.length;j++){
                if(fruits[i]<=baskets[j]){
                    if(baskets[j]==maxs[maxidx]){
                        baskets[j]=0;
                        maxs[maxidx]=findMaxi(maxidx*(n+1),(maxidx*(n+1))+(n+1),baskets);
                    }
                    baskets[j]=0;
                    cnt++;
                    break;
                }
            }
        }
        return fruits.length-cnt;
    }
}