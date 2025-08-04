class Solution {
    public int totalFruit(int[] fruits) {
    //    HashSet<Integer> set = new HashSet<>();
    //    int l=0;
    //    int r=0;
    //    int ans=0;
    //    int cnt=0;
    //    while(l<fruits.length){
    //     if(set.contains(fruits[l]) || set.size()<2)set.add(fruits[l]);
    //     else if(set.size()==2){
    //         int prev=fruits[l-1];
    //         r=l-1;
    //         while(r>0 && fruits[r]==prev) r--;
    //         set.remove(fruits[r]);
    //         r++;
    //         set.add(fruits[l]);
    //     }
    //     ans=Math.max(ans,l-r+1);
    //     l++;
    //    }
    //    return ans;
    int ans=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    int l=0;
    int r=0;
    while(l<fruits.length){
        map.put(fruits[l],map.getOrDefault(fruits[l],0)+1);
        if(map.size()>2){
            while(r<l){
                map.put(fruits[r],map.getOrDefault(fruits[r],0)-1);
                if(map.get(fruits[r])==0){
                    map.remove(fruits[r]);
                    r++;
                    break;
                }
                r++;
            }
        }
        ans=Math.max(ans,l-r+1);
        l++;
    }
    return ans;
    }
}