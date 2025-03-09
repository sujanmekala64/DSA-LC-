class Solution {
    // public int check(int start,int end,String blocks){
    //     int cnt=0;
    //     for(int i=start;i<end;i++){
    //         if(blocks.charAt(i)=='W') cnt++;
    //     }
    //     return cnt;
    // }
    public int minimumRecolors(String blocks, int k) {
        int blacks=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            if(i-k>=0 && blocks.charAt(i-k)=='B') blacks--;
            if(blocks.charAt(i)=='B') blacks++;
            mini=Math.min(mini,k-blacks);
        }
        return mini;
        // int idx=0;
        // int mini=Integer.MAX_VALUE;
        // while(idx+k<=blocks.length()){
        //     int whites = check(idx,idx+k,blocks);
        //     mini=Math.min(mini,whites);
        //     idx++;
        // }
        // return mini;
    }
}