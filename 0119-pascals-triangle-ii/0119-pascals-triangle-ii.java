class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) li.add(1);
                else{
                    int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    li.add(val);
                }
            }
            ans.add(li);
        }
        return ans.get(rowIndex);
    }
}