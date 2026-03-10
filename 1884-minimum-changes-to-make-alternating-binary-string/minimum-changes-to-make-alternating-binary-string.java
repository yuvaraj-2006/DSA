class Solution {
    public int minOperations(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
           char e1=(i%2==0)?'0':'1';
           char e2=(i%2==0)?'1':'0';
           if(s.charAt(i)==e1) count1++;
           if(s.charAt(i)==e2) count2++;
        }
        return Math.min(count1,count2);
    }
}