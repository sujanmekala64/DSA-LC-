class Solution {
    List<Integer> li;
    Random rand;
    int totval=0;
    int arr[];
    public Solution(int[] w) {
        li=new ArrayList<>();
        rand=new Random();
        for(int we:w) totval+=we;
        arr=new int[w.length];
        int idx=0;
        for(int we:w) arr[idx++]=we;
    }
    
    public int pickIndex() {
        int val=rand.nextInt(totval);
        int sum=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>val){
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */