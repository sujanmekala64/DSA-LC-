class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=(int)(Math.sqrt(fruits.length));
        int maxs[] = new int[n+1];
        int val=1;
        while(val<=n+1){
            int maxi=Integer.MIN_VALUE;
            for(int i=(val-1)*(n+1);i<((val-1)*(n+1))+(n+1) && i<fruits.length;i++){
                maxi=Math.max(baskets[i],maxi);
            }
            maxs[val-1]=maxi;
            val++;
        }
        for(int i=0;i<=n;i++) System.out.print(maxs[i]+" ");
        System.out.println();
        int cnt=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<=n;j++){
                if(fruits[i]<=maxs[j]){
                    int value=j;
                    for(int k=value*(n+1);k<(value*(n+1))+(n+1) && k<fruits.length;k++){
                        if(fruits[i]<=baskets[k]){
                        System.out.println(value+" "+fruits[i]+" "+baskets[k]);
                            if(baskets[k]==maxs[j]){
                                baskets[k]=0;
                                int maxi=Integer.MIN_VALUE;
                                for(int f=value*(n+1);f<(value*(n+1))+(n+1) && f<fruits.length;f++){
                                    maxi=Math.max(baskets[f],maxi);
                                }
                                maxs[value]=maxi;
                            }
                            baskets[k]=0;
                            cnt++;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return fruits.length-cnt;
    }
}