class Solution {
    public boolean selfdividing(int n){
        int g=n;
        while(g>0){
            int f=g%10;
            if(f==0 || n%f!=0) return false;
            g/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdividing(i)) li.add(i);
        }
        return li;
    }
}