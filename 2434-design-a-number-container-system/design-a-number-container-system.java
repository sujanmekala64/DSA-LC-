class NumberContainers {
    HashMap<Integer,TreeSet<Integer>> map;
    HashMap<Integer,Integer> indexmap;
    public NumberContainers() {
        map=new HashMap<>();
        indexmap=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(!map.containsKey(number) && !indexmap.containsKey(index)){
            TreeSet<Integer> set = new TreeSet<>();
            set.add(index);
            map.put(number,set);
            indexmap.put(index,number);
        }
        else if(map.containsKey(number) && !indexmap.containsKey(index)){
            TreeSet<Integer> set = map.get(number);
            set.add(index);
            map.put(number,set);
            indexmap.put(index,number);
        }
        else if(indexmap.containsKey(index)){
            int num = indexmap.get(index);
            TreeSet<Integer> check = map.get(num);
            check.remove(index);
            map.put(num,check);
            if(!map.containsKey(number)){
                TreeSet<Integer> set = new TreeSet<>();
                set.add(index);
                map.put(number,set);
                indexmap.put(index,number);
            }
            else if(map.containsKey(number)){
                 TreeSet<Integer> set = map.get(number);
                set.add(index);
                map.put(number,set);
                indexmap.put(index,number);
            }
        }
    }
    
    public int find(int number) {
        if(map.containsKey(number)){
            TreeSet<Integer> set = map.get(number);
            if(set.size()>=1) return set.first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */