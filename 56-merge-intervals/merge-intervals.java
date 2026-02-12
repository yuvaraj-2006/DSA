class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[1][1];
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] cur=new int[2];
        cur[0]=intervals[0][0];
        cur[1]=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=cur[1]){
                cur[1]=Math.max(cur[1],intervals[i][1]);
            }else{
                res.add(cur);
                cur=intervals[i];
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}