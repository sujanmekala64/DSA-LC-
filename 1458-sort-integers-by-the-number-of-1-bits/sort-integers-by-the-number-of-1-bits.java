class Solution {
    public int[] sortByBits(int[] arr) {
        Integer boxedarray[] = new Integer[arr.length];
        for(int i=0;i<arr.length;i++) boxedarray[i]=arr[i];
        Arrays.sort(boxedarray,(a,b)->{
            int vala = Integer.bitCount(a);
            int valb = Integer.bitCount(b);
            if(vala==valb) return a-b;
            return vala-valb;
        });
        for(int i=0;i<arr.length;i++) arr[i]=boxedarray[i];
        return arr;
    }
}