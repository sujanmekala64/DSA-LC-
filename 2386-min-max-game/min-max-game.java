class Solution {
    public int minMaxGame(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int num:nums) li.add(num);
        while(li.size()!=1){
            List<Integer> temp = new ArrayList<>();
            System.out.println(li);
            int min=1;
            for(int i=0;i<li.size()-1;i+=2){
                if(min==1){
                    temp.add(Math.min(li.get(i),li.get(i+1)));
                }
                else{
                    temp.add(Math.max(li.get(i),li.get(i+1)));
                }
                min=1-min;
            }
            li=temp;
        }
        return li.get(0);
    }
}