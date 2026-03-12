class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,res,new ArrayList<>());
        return res;
    }
    public void solve(int ind,int[] arr,List<List<Integer>> res,ArrayList<Integer> list){
        if(ind==arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[ind]);
        solve(ind+1,arr,res,list);
        list.remove(list.size()-1);

        solve(ind+1,arr,res,list);
    }
}