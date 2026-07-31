class Solution {
    int[][] dp;
    public int maxProfit(int[] nums) {
    int n=nums.length;
    dp=new int[n][2];
    for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
    return solve(0,1,nums);
    }
    public int solve(int i,int buy,int[] nums){
        if(i>=nums.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit;
        if(buy==1){
            int buystock =-nums[i]+solve(i+1,0,nums);
            int hold=solve(i+1,1,nums);
            profit=Math.max(buystock,hold);
        }else{
            int sell=nums[i]+solve(i+2,1,nums);
            int hold=solve(i+1,0,nums);
            profit=Math.max(sell,hold);
        }
        return dp[i][buy]=profit;
    }
}