class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        solve(res,nums,visited,new ArrayList<>());
        return res;
    }
    public void solve(List<List<Integer>> res,int[] nums,boolean[] visited,List<Integer> ans){
       if(ans.size()==nums.length){
        res.add(new ArrayList<>(ans));
        return;
       }
       for(int i=0;i<nums.length;i++){
        if(!visited[i]){
        ans.add(nums[i]);
        visited[i]=true;
        solve(res,nums,visited,ans);
        ans.remove( (ans.size())-1);
        visited[i]=false;
        }
       }
    } 
}