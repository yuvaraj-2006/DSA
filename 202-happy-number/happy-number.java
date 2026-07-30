class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int num=n;
            int sum=0;
            while (num > 0){
                int digit=num%10;
                sum+=(digit*digit);
                num=num/10;
            }
            n=sum;
        }
        return n==1;
    }
}