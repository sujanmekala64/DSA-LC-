class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<3 && i<s.length();i++){
            char p = s.charAt(i);
            map.put(p,map.getOrDefault(p,0)+1);
        }
        if(map.size()==3) ans++;
        int idx=0;
        for(int i=3;i<s.length();i++){
            char prev = s.charAt(idx);
            char pres = s.charAt(i);
            // if(prev==pres) continue;
            map.put(pres,map.getOrDefault(pres,0)+1);
            map.put(prev,map.getOrDefault(prev,0)-1);
            if(map.get(prev)==0) map.remove(prev);
            if(map.size()==3){
                System.out.println(i);
                ans++;
            }
            idx++;
        }
        return ans;
    }
}