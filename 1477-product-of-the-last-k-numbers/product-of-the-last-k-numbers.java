class ProductOfNumbers {
    List<Integer> li;
    public ProductOfNumbers() {
        li=new ArrayList<>();
    }
    
    public void add(int num) {
        li.add(num);
    }
    
    public int getProduct(int k) {
        int ans=1;
        int idx=li.size()-1;
        while(k>0 && idx>=0){
            ans=ans*li.get(idx);
            idx--;
            k--;
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */