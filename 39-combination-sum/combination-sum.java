class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        helper(0,res,target,candidates,new ArrayList<>());
        return res;
    }
    public void helper(int ind,List<List<Integer>> res,int target,int[] arr,ArrayList<Integer> list){
        if(ind==arr.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<= target){
            list.add(arr[ind]);
            helper(ind,res,target-arr[ind],arr,list);
            list.remove(list.size()-1);
        }
        helper(ind+1,res,target,arr,list);
    }
}