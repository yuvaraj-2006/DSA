class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int[] minCost=new int[n];
        boolean[] visited=new boolean[n];
        Arrays.fill(minCost,Integer.MAX_VALUE);
        minCost[0]=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int node=-1;
            for(int j=0;j<n;j++){
                if(!visited[j] && (node==-1 || minCost[j]<minCost[node])){
                    node=j;
                }
            }
            visited[node]=true;
            ans+=minCost[node];
            for(int next=0;next<n;next++){
                if(!visited[next]){
                    int dist=Math.abs(points[node][0]-points[next][0])+
                    Math.abs(points[node][1]-points[next][1]);
                    minCost[next]=Math.min(dist,minCost[next]);
                }
            }
        }
        return ans;
    }
}