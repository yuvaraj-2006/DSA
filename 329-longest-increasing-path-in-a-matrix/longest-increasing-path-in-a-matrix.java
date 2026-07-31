class Solution {
    int[][] dp;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    
    public int longestIncreasingPath(int[][] nums) {
        int rows=nums.length;
        int cols=nums[0].length;
        dp=new int[rows][cols];
        int max=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               max=  Math.max(max,solve(i,j,nums));
            }
        }
        return max;
    }

    public int solve(int i,int j,int[][] nums){
        if(dp[i][j]!=0) return dp[i][j];
        int best=1;
        for(int[] d : dir){
            int nr=d[0]+i;
            int nc=d[1]+j;
            if( nr < 0 || nc < 0 || nr >= nums.length || nc >= nums[0].length || nums[nr][nc] <= nums[i][j] ){
                continue;
            }
            best=Math.max(best,1+solve(nr,nc,nums));
        }
        return dp[i][j]=best;
    }
}