class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(!map.containsKey((i-j))) li = new ArrayList<>();
                else li = map.get(i-j);                    
                li.add(mat[i][j]);
                Collections.sort(li);
                map.put((i-j),li);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int val = (i-j);
                li = map.get(val);
                mat[i][j]=li.get(0);
                li.remove(0);
            }
        }
        return mat;
    }
}