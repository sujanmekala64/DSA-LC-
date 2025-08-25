class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int ans[] = new int[r*c];
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!map.containsKey((i+j))) map.put((i+j),new ArrayList<>());
                map.get((i+j)).add(mat[i][j]);
            }
        }
        int idx=0;
        for(int key:map.keySet()){
            List<Integer> li = map.get(key);
            if(key%2==0){
                for(int i=li.size()-1;i>=0;i--){
                    ans[idx++]=li.get(i);
                }
            }
            else{
                for(int i=0;i<li.size();i++){
                    ans[idx++]=li.get(i);
                }
            }
        }
        return ans;
    }
}