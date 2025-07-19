class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length/3;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        long ls=0;
        long rs=0;
        long leftsum[] = new long[nums.length];
        long rightsum[] = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            maxheap.offer(nums[i]);
            ls+=nums[i];
            if(maxheap.size()>n){
                ls-=maxheap.poll();
            }
            if(maxheap.size()==n){
                leftsum[i]=ls;
            }
            else leftsum[i]=Long.MAX_VALUE;
        }
        for(int i=nums.length-1;i>=0;i--){
            minheap.offer(nums[i]);
            rs+=nums[i];
            if(minheap.size()>n){
                rs-=minheap.poll();
            }
            if(minheap.size()==n) rightsum[i]=rs;
            else rightsum[i]=Long.MIN_VALUE;
        }
        long ans=Long.MAX_VALUE;
        for(int i=n-1;i<nums.length-n;i++){
            if(leftsum[i]!=Long.MAX_VALUE && rightsum[i+1]!=Long.MIN_VALUE){
                ans=Math.min(ans,leftsum[i]-rightsum[i+1]);
            }
        }
        return ans;
    }
}