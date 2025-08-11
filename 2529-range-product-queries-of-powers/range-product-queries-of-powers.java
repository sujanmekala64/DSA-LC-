class Solution {
    public int[] productQueries(int n, int[][] queries) {
        String s = Integer.toBinaryString(n);
        List<Integer> li = new ArrayList<>();
        int f=0;
        for(int i=s.length()-1;i>=0;i--){
            char p=s.charAt(i);
            if(p=='1'){
                int val = (int)(Math.pow(2,f));
                li.add(val);
            }
            f++;
        }
        int ans[]=new int[queries.length];
        int MOD = 1000000007;
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            long answ=1;
            for(int j=l;j<=r;j++){
                answ = (answ * li.get(j)) % MOD;
            }
            ans[i]=(int)(answ);
        }
        return ans;
    }
}