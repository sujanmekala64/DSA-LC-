class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones) queue.offer(num);
        while(queue.size()>1){
            int max=queue.poll();
            int smax=queue.poll();
            int num=max-smax;
            if(num!=0) queue.offer(num);
        }
        return queue.size()==1?queue.poll():0;
    }
}