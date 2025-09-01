class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int i=0;i<classes.length;i++){
            double calc = (double) classes[i][0]/classes[i][1];
            double added = (double) (classes[i][0]+1)/(classes[i][1]+1);
            double val = (added-calc);
            pq.offer(new double[]{val,i});
        }
        while(extraStudents>0){
            double vals[] = pq.poll();
            int idx = (int)vals[1];
            classes[idx][0]++;
            classes[idx][1]++;
            double calc = (double) classes[idx][0]/classes[idx][1];
            double added = (double) (classes[idx][0]+1)/(classes[idx][1]+1);
            double val = (added-calc);
            pq.offer(new double[]{val,idx});
            extraStudents--;
        }
        double ans=0;
        for(int i=0;i<classes.length;i++){
            ans+= (double)classes[i][0]/classes[i][1];
        }
        return ans/classes.length;
    }
}