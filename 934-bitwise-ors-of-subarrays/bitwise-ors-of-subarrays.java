class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> cur = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        cur.add(arr[0]);
        ans.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            HashSet<Integer> cur2 = new HashSet<>();
            for(int val:cur){
                int c=val|arr[i];
                cur2.add(c); //we keep new set since we cant modify the same set while iterating
            }
            cur2.add(arr[i]);
            ans.addAll(cur2);
            cur=cur2;
        }
        return ans.size();
    }
}