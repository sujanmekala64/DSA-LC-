class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxi=-1;
        for(int num:costs){
            if(num>maxi) maxi=num;
        }
        int count[] = new int[maxi+1];
        for(int i=0;i<costs.length;i++){
            count[costs[i]]++;
        }
        int ans=0;
        for(int i=1;i<=maxi;i++){
            if(coins>=i && count[i]!=0){
                while(count[i]-->0 && coins>=i){
                    ans++;
                    coins-=i;
                    System.out.println(i+" "+ans+" "+coins);
                }
            }
        }
        return ans;
    }
}