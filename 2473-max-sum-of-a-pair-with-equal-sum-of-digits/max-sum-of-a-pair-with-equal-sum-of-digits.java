class Solution {
    public int countDigitSum(int val){
        int sum=0;
        while(val>0){
            int g = val%10;
            sum+=g;
            val=val/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        int digitsum[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            digitsum[i]=countDigitSum(nums[i]);
        }
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int ans=-1;
        for(int i=digitsum.length-1;i>=0;i--){
            int digits = digitsum[i];
            int value = nums[i];
            if(!map.containsKey(digits)){
                List<Integer> li = new ArrayList<>();
                li.add(value);
                li.add(0); // 0 represents it can be added later on
                map.put(digits,li);
            }
            else{
                // System.out.println(value+" "+digits+" "+map.get(digits).get(1));
                if(map.get(digits).get(1)==0){
                    List<Integer> newli = new ArrayList<>();
                    int newval = map.get(digits).get(0)+value;
                    newli.add(newval);
                    newli.add(1);
                    map.put(digits,newli);
                    ans=Math.max(ans,newval);
                    
                }
            }
        }
        return ans;
    }
}