class Solution {
    public int nextBeautifulNumber(int n) {
        n++;
        while(true){
            if(helper(n)) return n;
            n++;
        }
    }
    public boolean helper(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int key=n%10;
            map.put(key,map.getOrDefault(key,0)+1);
            n/=10;
        }
        for(int key:map.keySet()){
            if(key!=map.get(key)) return false;
        }
        return true;
    }
}