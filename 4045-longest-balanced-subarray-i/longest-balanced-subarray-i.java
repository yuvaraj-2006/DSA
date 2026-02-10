class Solution {
    public int longestBalanced(int[] nums) {
      int count=0;
      for(int j=0;j<nums.length;j++){
        HashSet<Integer> odd=new LinkedHashSet<>();
        HashSet<Integer> even=new LinkedHashSet<>();
        for(int i=j;i<nums.length;i++){
              if(nums[i]%2==0){
                even.add(nums[i]);
              }else{
                odd.add(nums[i]);
              }
              if(odd.size()==even.size()){
                count=Math.max(count,i-j+1);
              }
        }
      }
      return count;
    }
}