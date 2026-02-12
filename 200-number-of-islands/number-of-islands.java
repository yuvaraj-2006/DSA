class Solution {
    private void dfs(char[][] c,boolean[][] vis,int i,int j){
       if(i<0 || j<0 || i >=c.length || j>=c[0].length || vis[i][j] || c[i][j]!='1'){
        return;
       }
       vis[i][j]=true;
       dfs(c,vis,i+1,j);
       dfs(c,vis,i-1,j);
       dfs(c,vis,i,j+1);
       dfs(c,vis,i,j-1);
    }
    
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] vis=new boolean[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return count;
    }
}