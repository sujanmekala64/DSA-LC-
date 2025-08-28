class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key = i-j; //i-j will be same for diagonals
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }
        for(Integer key:map.keySet()){
            List<Integer> li = map.get(key);
            if(key<0){ //top right
                Collections.sort(li);
            } 
            else{ //bottom left and middle
                li.sort(Collections.reverseOrder());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                grid[i][j]=map.get(key).remove(0);
            }
        }
        return grid;
    }
}