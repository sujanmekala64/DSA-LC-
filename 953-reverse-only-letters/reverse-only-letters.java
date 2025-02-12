class Solution {
    public String reverseOnlyLetters(String s) {
        int low=0;
        int high=s.length()-1;
        char p[] = s.toCharArray();
        while(low<=high){
            if(Character.isLetter(p[low]) && Character.isLetter(p[high])){
                char temp=p[low];
                p[low]=p[high];
                p[high]=temp;
            }
            else if(Character.isLetter(p[low])){
                while(Character.isLetter(p[low]) && !Character.isLetter(p[high])){
                    high--;
                }
               char temp=p[low];
                p[low]=p[high];
                p[high]=temp;
            }
            else if(Character.isLetter(p[high])){
                while(Character.isLetter(p[high]) && !Character.isLetter(p[low])){
                    low++;
                }
                char temp=p[low];
                p[low]=p[high];
                p[high]=temp;
            }
            low++;
            high--;
        }
        return String.valueOf(p);
    }
}