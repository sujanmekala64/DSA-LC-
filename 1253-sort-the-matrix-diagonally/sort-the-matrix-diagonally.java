class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(!map.containsKey((i-j))) minheap = new PriorityQueue<>();
                else minheap = map.get(i-j);                    
                minheap.offer(mat[i][j]);
                map.put((i-j),minheap);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int val = (i-j);
                minheap = map.get(val);
                mat[i][j]=minheap.peek();
                minheap.poll();
            }
        }
        return mat;
    }
}