class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<responses.size();i++){
            for(int j=0;j<responses.get(i).size();j++){
                set.add(responses.get(i).get(j));
            }
            for(String val:set) map.put(val,map.getOrDefault(val,0)+1);
            set.clear();
        }
        String ans="";
        int max=0;
        for(String val:map.keySet()){
            if(map.get(val)>max){
                max=map.get(val);
                ans=val;
            }
            else if(map.get(val)==max && val.compareTo(ans)<0) ans=val;
        }
        return ans;
    }
}