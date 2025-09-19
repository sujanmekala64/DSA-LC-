class Spreadsheet {
    HashMap<String,Integer> map;
    public Spreadsheet(int rows) {
        map=new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        map.put(cell,0);
    }
    
    public int getValue(String formula) {
        String s1 = "";
        int idx=1;
        while(formula.charAt(idx)!='+'){
            s1+=formula.charAt(idx);
            idx++;
        }
        String s2 = formula.substring(idx+1,formula.length());
        if(map.containsKey(s1) && map.containsKey(s2)){
            return map.get(s1)+map.get(s2);
        }
        int val2=Integer.parseInt(s2);
        if(map.containsKey(s1)){
            return map.get(s1)+val2;
        }
        int val1=Integer.parseInt(s1);
        return (val1+val2);
    }   
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */