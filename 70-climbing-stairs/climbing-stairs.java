class Solution {
    public int climbStairs(int n) {
        if(n<0) return -1;
        if(n<=2) return n;
        int n1=2;
        int n2=1;
        for(int i=3;i<=n;i++){
          int cur=n1 +n2;
          n2=n1;
          n1=cur;
        }
        return n1;
    }
}