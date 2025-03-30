class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            map.put(p,i);
        }
        int prevmaxidx=-1;
        int maxi=-1;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            maxi=Math.max(maxi,map.get(p));
            if(maxi==i){ //partition
                ans.add(maxi-prevmaxidx);
                prevmaxidx=maxi;
            }
        }
        return ans;
    }
}