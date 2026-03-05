class Solution {
    public boolean canJump(int[] nums) {
        boolean[] res=new boolean[nums.length];
        res[0]=true;
        for (int i = 0; i < nums.length; i++) {
            if(!res[i]){
                continue;
            }
            for(int j=1; j <= nums[i] && i+j < nums.length;j++){
                res[i+j]=true;
            }
        }
        return res[nums.length-1];
    }
}