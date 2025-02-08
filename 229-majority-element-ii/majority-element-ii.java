class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int ele1=-100;
        int ele2=-100;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i]) cnt1++;
            else if(ele2==nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) a++;
            else if(nums[i]==ele2) b++;
        }
        if(a>n/3) li.add(ele1);
        if(b>n/3) li.add(ele2);
        return li;
    }
}