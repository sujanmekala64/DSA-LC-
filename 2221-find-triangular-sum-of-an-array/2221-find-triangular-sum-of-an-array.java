class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int num:nums) li.add(num);
        while(li.size()!=1){
            List<Integer> temp = new ArrayList<>();
            for(int i=1;i<li.size();i++){
                int val = (li.get(i-1)+li.get(i))%10;
                temp.add(val);
            }
            li=temp;
        }
        return li.get(0);
    }
}