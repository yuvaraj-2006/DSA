class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n1=robber(nums,1,nums.length);
        int n2=robber(nums,0,nums.length-1);
        return Math.max(n1,n2);
    }
    private int robber(int[] nums, int st,int end){
        int prev1=0;
        int prev2=0;
        for(int i=st;i<end;i++){
            int cur=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=cur;
        }
        return prev1;
    }
}