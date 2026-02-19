class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1) return s;
        StringBuilder[] row=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int cur=0;
        boolean goDown=false;
        for(int i=0;i<s.length();i++){
            row[cur].append(s.charAt(i));
            if(cur==0 || cur==numRows-1){
                goDown=!goDown;
            }
            cur+=goDown?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(row[i]);
        }
       return result.toString();
    }
}