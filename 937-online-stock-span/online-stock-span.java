class StockSpanner {
    List<Integer> li;
    public StockSpanner() {
        li = new ArrayList<>();
    }
    
    public int next(int price) {
        int cnt=1;
        for(int i=li.size()-1;i>=0;i--){
            if(li.get(i)<=price) cnt++;
            else break;
        }
        li.add(price);
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */