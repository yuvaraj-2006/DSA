class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // HashSet<String> res=new HashSet<>();
        // boolean[] visited=new boolean[s1.length()];
        // permutation(s1,res,visited,new StringBuilder());
        int k=s1.length();
        if(k>s2.length())return false;
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String target=new String(arr);
        for(int i=0;i<=s2.length()-k;i++){
          String str=s2.substring(i,i+k);
          char[] a=str.toCharArray();
          Arrays.sort(a);
          if(target.equals(new String(a))){
            return true;
          }
        }
      return false;
    }
}
//     public void permutation(String s1,HashSet<String> res,boolean[] visited,StringBuilder str){
//         if(s1.length()==str.length()){
//             res.add(str.toString());
//             return;
//         }
//         for(int i=0;i<s1.length();i++){
//             if(!visited[i]){
//                 visited[i]=true;
//                 str.append(s1.charAt(i));
//                 permutation(s1,res,visited,str);
//                 str.deleteCharAt(str.length()-1);
//                 visited[i]=false;
//             }
//         }
//     }
// }