class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=0;
        int maxi=-1;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(arr[i],maxi);
            if(maxi==i) count++;
        }
        return count;
    }
}