class Solution {
    public List<Integer> generateList(int r){
        List<Integer> li = new ArrayList<>();
        li.add(1);
        int ans = 1;
        for(int c=1;c<r;c++){
            ans = ans * (r-c);
            ans  = ans /c;
            li.add(ans);
        }
        return li;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finali = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            finali.add(generateList(i));
        }
        return finali;
    }
}