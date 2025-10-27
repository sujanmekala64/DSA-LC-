class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> li = new ArrayList<>();
        for(String val:bank){
            int cnt=0;
            for(char p:val.toCharArray()){
                if(p=='1') cnt++;
            }
            if(cnt!=0) li.add(cnt);
        }
        int ans=0;
        if(li.size()>1){
            for(int i=1;i<li.size();i++){
                ans+=li.get(i-1)*li.get(i);
            }
        }
        return ans;
    }
}