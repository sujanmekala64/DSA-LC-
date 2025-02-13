class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) pq.add((long)nums[i]);
        int cnt=0;
        while(true){
            if(pq.size()>=2){
                long first = pq.poll();
                long second = pq.poll();
                if(first>=k) break;
                long val = second + 2L*(first);
                pq.add(val);
            }
            else break;
            cnt++;
        }
        return cnt;
    }
}