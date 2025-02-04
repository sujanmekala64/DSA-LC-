class Solution {
    public String getPermutation(int n, int k) {
       int fact=1;
       List<Integer> li = new ArrayList<>();
       for(int i=1;i<n;i++){
        fact=fact*i;
        li.add(i);
       }
       li.add(n);
       //for n=4 now fcat will be 6 we will divivde into 4 blocks of 6 size
       k=k-1; //0 based indesxing
       String ans="";
       while(true){
        ans=ans+li.get(k/fact);
        li.remove(k/fact);
        if(li.size()==0) break;
        k=k%fact;
        fact=fact/li.size();
       }
       return ans;
    }
}