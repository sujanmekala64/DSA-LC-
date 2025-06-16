class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(!map.containsKey(p)) map.put(p,i);
            else{
                int val = i-map.get(p)-1;
                int cu = p-'a';
                if(distance[cu]!=val) return false; 
            }
        }
        return true;
    }
}