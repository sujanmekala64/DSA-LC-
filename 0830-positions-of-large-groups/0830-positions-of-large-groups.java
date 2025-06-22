class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int start=0;
        int end=0;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                end=i-1;
                if(cnt>=3) ans.add(Arrays.asList(start,end));
                start=i;
                cnt=1;
            }
        }
        if(cnt>=3){
            end=s.length()-1;
            ans.add(Arrays.asList(start,end));
        }
        return ans;   
    }
}