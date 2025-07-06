class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<stones.length;i++) li.add(stones[i]);
        Collections.sort(li);
        while(li.size()>1){
            int a = li.remove(li.size()-1);
            int b = li.remove(li.size()-1);
            int ans = Math.abs(a-b);
            if(ans!=0){
                li.add(ans);
                Collections.sort(li);
            }
        }
        return li.size()>=1?li.get(0):0;
    }
}