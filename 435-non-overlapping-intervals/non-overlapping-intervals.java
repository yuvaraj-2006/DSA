class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int count=0;
        Arrays.sort(nums,(a,b)->a[1]-b[1]);
        int end=nums[0][1];
        for(int i=1;i<nums.length;i++){
            if(nums[i][0] >= end){
                count++;
                end=nums[i][1];
            }
        }
        return nums.length-count-1;
    }
}