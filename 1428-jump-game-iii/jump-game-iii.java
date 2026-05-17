class Solution {
    // public boolean check(int arr[],int start,HashSet<Integer> visited){
    //     if(start<0 || start>=arr.length) return false;
    //     if(visited.contains(start))  return false;
    //     if(arr[start]==0) return true;
    //     visited.add(start);
    //     boolean forward = check(arr,start+arr[start],visited);
    //     boolean backward = check(arr,start-arr[start],visited);
    //     return forward||backward;
    // }
    public boolean canReach(int[] arr, int start){
        // return check(arr,start,new HashSet<>());
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        HashSet<Integer>  visited = new HashSet<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int val=queue.poll();
                if(arr[val]==0) return true;
                int front=val+arr[val];
                int back=val-arr[val];
                if(front<arr.length && !visited.contains(front)){
                    queue.add(front);
                    visited.add(front);
                }
                if(back>=0 && !visited.contains(back)){
                    queue.add(back);
                    visited.add(back);
                }
            }
        }
        return false;
    }
}