class Pair implements Comparable<Pair>{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
    @Override
    public int compareTo(Pair o){
        int compare = this.key-o.key;
        if(compare==0) return this.key-o.key;
        else return compare;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            if(!map.containsKey(val)) map.put(val,1);
            else map.put(val,map.get(val)+1);
        }
        // TreeMap<Integer,Integer> sortedmap = new TreeMap<>((k1,k2)->{
        //     int compare = map.get(k2).compareTo(map.get(k1));
        //     if(compare==0) return k1.compareTo(k2);
        //     else return compare;
        // });
        // sortedmap.putAll(map);
        PriorityQueue<Pair> minheap = new PriorityQueue<>();
        for(Integer keys:map.keySet()){
            minheap.add(new Pair(map.get(keys),keys));
            if(minheap.size()>k) minheap.poll();
        }
        int arr[] = new int[k];
        int idx=0;
        while(minheap.size()!=0){
            arr[idx++]=minheap.poll().value;
        }
        return arr;
    }
}