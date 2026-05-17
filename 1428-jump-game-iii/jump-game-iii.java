class Solution {
    public boolean check(int arr[],int start,HashSet<Integer> visited){
        if(start<0 || start>=arr.length) return false;
        if(visited.contains(start))  return false;
        if(arr[start]==0) return true;
        visited.add(start);
        boolean forward = check(arr,start+arr[start],visited);
        boolean backward = check(arr,start-arr[start],visited);
        return forward||backward;
    }
    public boolean canReach(int[] arr, int start){
        return check(arr,start,new HashSet<>());
    }
}