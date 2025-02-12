class KthLargest {
    int k;
    PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        queue = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            queue.add(nums[i]);
            if(queue.size()>k) queue.poll();
        }
    }
    
    public int add(int val) {
        queue.add(val);
        if(queue.size()>k) queue.poll();
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */