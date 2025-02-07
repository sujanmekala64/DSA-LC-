class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> colorfreq = new HashMap<>();
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int key = queries[i][0];
            int val = queries[i][1];
            if(map.containsKey(key)){
                int exsistval = map.get(key);
                colorfreq.put(exsistval,colorfreq.get(exsistval)-1);
                if(colorfreq.get(exsistval)==0) colorfreq.remove(exsistval);   
            }
            map.put(key,val);
            if(!colorfreq.containsKey(val)) colorfreq.put(val,1);
            else colorfreq.put(val,colorfreq.get(val)+1);
            ans[i]=colorfreq.size();
        }
        return ans;
    }
}