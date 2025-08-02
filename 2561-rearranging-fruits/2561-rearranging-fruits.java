class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> b1 = new HashMap<>();
        HashMap<Integer,Integer> b2 = new HashMap<>();
        int mini=Integer.MAX_VALUE;
        for(int num:basket1){
            b1.put(num,b1.getOrDefault(num,0)+1);
            mini=Math.min(num,mini);
        }
        for(int num:basket2){
            b2.put(num,b2.getOrDefault(num,0)+1);
            mini=Math.min(num,mini);
        }
        List<Integer> li = new ArrayList<>();
        for(int key:b1.keySet()){
            int freq1 = b1.get(key);
            int freq2=0;
            if(b2.containsKey(key)) freq2=b2.get(key);
            if(Math.abs(freq1-freq2)%2==1) return -1;
            else{
                int cnt = (Math.abs(freq1-freq2))/2;
                for(int i=1;i<=cnt;i++) li.add(key);
            }
        }
        for(int key:b2.keySet()){
            int freq1=b2.get(key);
            int freq2=0;
            if(b1.containsKey(key)) continue;
            if(b1.containsKey(key)) freq2=b1.get(key);
            if(Math.abs(freq1-freq2)%2==1) return -1;
            else{
                int cnt=(Math.abs(freq1-freq2))/2;
                for(int i=1;i<=cnt;i++) li.add(key);
            }
        }
        Collections.sort(li);
        long ans=0;
        for(int i=0;i<li.size()/2;i++) ans+=Math.min(li.get(i),2*mini);
        return ans;
    }
}