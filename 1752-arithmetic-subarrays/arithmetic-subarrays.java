class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int leftidx = l[i];
            int rightidx = r[i];
            PriorityQueue<Integer> queue = new PriorityQueue<>(); //u can take list n sort it too or u can ake array of size rightidx-leftidx n sort it
            for(int j=leftidx;j<=rightidx;j++){
                queue.offer(nums[j]);
            }
            int firstele=queue.poll();
            int secondele=queue.poll();
            int diff=secondele-firstele;
            boolean check=true;
            while(queue.size()!=0){
                firstele=secondele;
                secondele=queue.poll();
                if((secondele-firstele)!=diff){
                    ans.add(false);
                    check=false;
                    break;
                }
            }
            if(check) ans.add(true);
        }
        return ans;
    }
}