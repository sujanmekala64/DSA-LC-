class Spreadsheet {
    HashMap<String,Integer> map;
    public boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
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
         String expr = formula.substring(1);
        String[] parts = expr.split("\\+");
        int sum = 0;

        for (String p : parts) {
            p = p.trim();
            if (map.containsKey(p)) {
                sum += map.get(p);  
            } else if(isNumber(p)){
                sum += Integer.parseInt(p);
            }
            else sum+=0;
        }
        return sum;
    }   
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */