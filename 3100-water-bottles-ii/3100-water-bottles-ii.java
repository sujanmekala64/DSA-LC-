class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int drunk=numBottles;
        numBottles=0;
        while(true){
            if(empty<numExchange){
                drunk+=numBottles;
                empty+=numBottles;
                numBottles=0;
                if(empty<numExchange) break;
            }
            else{
                empty=empty-numExchange;
                numExchange++;
                numBottles++;
            }
        }
        return drunk;
    }
}