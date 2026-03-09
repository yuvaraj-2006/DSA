class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res =new ArrayList<>();
        solve(res,"",0,0,n);
        return res;
    }
    public void solve(ArrayList<String> res,String s,int open,int close ,int  n){
         if(s.length()==n*2){
            res.add(s);
            return ;
         }
         if(open < n){
            solve(res,s+"(",open+1,close,n);
         }
         if(close < open){
            solve(res,s+")",open,close+1,n);
         }
    }
}