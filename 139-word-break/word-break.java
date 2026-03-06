class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       Boolean[] dp=new Boolean[s.length()];
       return solve(s,0,new HashSet<>(wordDict),dp);
    }
    public boolean solve(String s,int st,HashSet<String> set,Boolean[] dp){
        if(s.length()==st) return true;
        if(dp[st] != null) return dp[st]; 
        for(int i=st+1;i<=s.length();i++){
            if(set.contains(s.substring(st,i)) && solve(s,i,set,dp)){
                return dp[st]=true;
            }
        }
        return dp[st]=false;
    }
}