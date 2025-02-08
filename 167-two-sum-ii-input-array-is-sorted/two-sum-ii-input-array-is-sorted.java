class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        Map map = new HashMap();
        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
            }
            else{
                res[1] =i+1;
                res[0]=(int)map.get(target-numbers[i])+1;
                return res;
            }
        }
        return res;
    }
}