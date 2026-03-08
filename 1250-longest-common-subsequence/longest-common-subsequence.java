class Solution {
    String s1,s2;
    public int longestCommonSubsequence(String text1, String text2) {
        s1=text1;
        s2=text2;
        int dp[][]=new int[text1.length()][text2.length()];
        for(int[] row : dp){
         Arrays.fill(row, -1);
        }
        return solve(text1.length()-1,text2.length()-1,dp);
    }
    public int solve(int index1,int index2,int[][] dp){
        if(index1<0 || index2 <0) return 0;
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(s1.charAt(index1)==s2.charAt(index2)){
            return dp[index1][index2]= 1+solve(index1-1,index2-1,dp);
        }
        return dp[index1][index2]= Math.max(solve(index1,index2-1,dp),solve(index1-1,index2,dp));
    }
}