class Pair implements Comparable<Pair>{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
    @Override
    public int compareTo(Pair o) {
		if(this.key == o.key) return this.value-o.value;
        return this.key-o.key;
	}
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> minheap = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> answ = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int val = Math.abs(arr[i]-x);
            minheap.offer(new Pair(val,arr[i]));
            if(minheap.size()>k) minheap.poll();
        }
        while(!minheap.isEmpty()){
          answ.add(minheap.poll().value);
        }
        Collections.sort(answ);
        return answ;
    }
}