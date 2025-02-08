class Solution {
    public List<Integer> getans(List<Integer> li,int r){
        long ans = 1;
        r=r+1;
        li.add(1);
        for(int c=1;c<r;c++){
            ans = ans*(r-c);
            ans = ans/c;
            li.add((int)ans);
        }
        return li;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        getans(li,rowIndex);
        return li;
    }
}