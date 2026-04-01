class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int num=1;
        int top=0;
        int down=n-1;
        int left=0;
        int right=n-1;
        while(num <= (n*n) ){
        for(int i=left;i<=right;i++){
            arr[top][i]=num++;
        }
        top++;
        for(int i=top;i<=down;i++){
            arr[i][right]=num++;
        }
        right--;
        for(int i=right;i>=left;i--){
            arr[down][i]=num++;
        }
        down--;
        for(int i=down;i>=top;i--){
            arr[i][left]=num++;
        }
        left++;
      }
      return arr;
  }
}