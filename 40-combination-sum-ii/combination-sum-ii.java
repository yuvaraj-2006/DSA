class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> res=new ArrayList<>();
      Arrays.sort(candidates);
      solve(0,candidates,target,res,new ArrayList<>());
      return res;
    }
 void solve(int ind,int[] arr,int target,List<List<Integer>> res,ArrayList<Integer> list){ 
          if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = ind; i < arr.length; i++){

            if(i > ind && arr[i] == arr[i-1]) continue;

            if(arr[i] > target) break;

            list.add(arr[i]);

            solve(i + 1, arr, target - arr[i], res, list);

            list.remove(list.size() - 1);
        }
    }
}