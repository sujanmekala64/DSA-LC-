class RandomizedCollection {
    List<Integer> vals;
    Random random;
    public RandomizedCollection() {
        vals = new ArrayList<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        if(vals.contains(val)){
            vals.add(val);
            return false;
        }
        vals.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(vals.contains(val)){
            vals.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        if(vals.size()==0) return -1;
        int rand = random.nextInt(vals.size());
        return vals.get(rand);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */