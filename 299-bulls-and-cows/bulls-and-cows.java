class Solution {
    // class Pair{
    //     int 
    // }
    public String getHint(String secret, String guess) {
        int secfreq[] = new int[10];
        int guessfreq[] = new int[10];
        int bulls=0;
        int cows=0;
       for(int i=0;i<secret.length();i++){
        if(secret.charAt(i)==guess.charAt(i)) bulls++;
        else{
            secfreq[secret.charAt(i)-'0']++;
            guessfreq[guess.charAt(i)-'0']++;
        }
       } 
       for(int i=0;i<10;i++){
        if(secfreq[i]!=0 && guessfreq[i]!=0){
            cows+=Math.min(secfreq[i],guessfreq[i]);
        }
       }
    //    System.out.println(bulls+" "+cows);
       return bulls+"A"+cows+"B";
    }
}