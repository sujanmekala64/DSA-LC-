class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sortedarr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) sortedarr[i]=arr[i];
        Arrays.sort(sortedarr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(sortedarr[i])) map.put(sortedarr[i],i+1-cnt);
            else cnt++;
        }
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}