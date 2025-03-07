class Solution {
    public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++){
            // if(i%2!=0){
                if(isPrime(i)) li.add(i);
            // }
        }
        if(li.size()<=1) return new int[]{-1,-1};
        int mini=Integer.MAX_VALUE;
        int first=-1;
        int last=-1;
        for(int i=1;i<li.size();i++){
            if(li.get(i)-li.get(i-1)<mini){
                first=li.get(i-1);
                last=li.get(i);
                mini=li.get(i)-li.get(i-1);
            }
        }
        return new int[]{first,last};
    }
}