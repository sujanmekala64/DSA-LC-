class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean one=true;
        boolean two=false;
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1){
                i++;
                one=false;
                two=true;
            }
            else{
                one=true;
                two=false;
            }
        }
        return one;
    }
}