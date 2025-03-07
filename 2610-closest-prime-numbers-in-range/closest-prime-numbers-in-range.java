class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[] = new boolean[right+1];
        Arrays.fill(prime,true);
        for(int i=2;i<=Math.sqrt(right);i++){
            if(prime[i]==true){
                for(int j=i*i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i!=1 && prime[i]==true) li.add(i);
        }
        int mini=Integer.MAX_VALUE;
        int first=-1;
        int second=-1;
        if(li.size()<=1) return new int[]{-1,-1};
        for(int i=1;i<li.size();i++){
            int val = li.get(i)-li.get(i-1);
            if(val<mini){
                first=li.get(i-1);
                second=li.get(i);
                mini=val;
            }
        }
        return new int[]{first,second};
    }
}