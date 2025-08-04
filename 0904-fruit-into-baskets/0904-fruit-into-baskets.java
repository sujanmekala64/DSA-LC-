class Solution {
    public int totalFruit(int[] fruits) {
       HashSet<Integer> set = new HashSet<>();
       int l=0;
       int r=0;
       int ans=0;
       int cnt=0;
       while(l<fruits.length){
        if(set.contains(fruits[l]) || set.size()<2)set.add(fruits[l]);
        else if(set.size()>=2){
            int prev=fruits[l-1];
            r=l-2;
            while(r>0 && fruits[r]!=prev) r--;
            set.remove(fruits[r]);
            r++;
            set.add(fruits[l]);
        }
        ans=Math.max(ans,l-r+1);
        System.out.println(l+" "+r);
        l++;
       }
       return ans;
    }
}