class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            if(map1.containsKey(list1[i])) map1.put(list1[i],map1.get(list1[i])+i);
            else map1.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map1.containsKey(list2[i])) map2.put(list2[i],map1.get(list2[i])+i);
        }
        TreeMap<String,Integer> sortedmap = new TreeMap<>((k1,k2)->{
            int compare = map2.get(k1).compareTo(map2.get(k2));
            if(compare==0) return k1.compareTo(k2);
            else return compare;
        });
        sortedmap.putAll(map2);
        List<String> li = new ArrayList<>();
        int cnt=0;
        int ans=-1;
        for(String keys:sortedmap.keySet()){
            int val=sortedmap.get(keys);
            if(cnt==0 || val==ans) li.add(keys);
            else break;
            ans=val;
            cnt++;
        }
        String arr[] = new String[li.size()];
        for(int i=0;i<li.size();i++) arr[i]=li.get(i);
        return arr;
    }
}