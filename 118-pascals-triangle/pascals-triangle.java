class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(1);
        ans.add(li);
        for(int i=1;i<numRows;i++){
            li = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) li.add(1);
                else{
                    int val = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    li.add(val);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}