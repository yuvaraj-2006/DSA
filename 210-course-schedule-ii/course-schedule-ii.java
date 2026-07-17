class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans =new int[numCourses];
        int[] ind =new int[numCourses];

        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] arr : prerequisites){
            int a=arr[0];
            int b=arr[1];
            list.get(b).add(a);
            ind[a]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int index=0;
        while(!q.isEmpty()){
            int i=q.poll();
            ans[index++]=i;
            for(int c : list.get(i)){
                ind[c]--;
                if(ind[c]==0){
                    q.add(c);
                }
            }
        }
        if (index != numCourses){
            return new int[0];
         }
        return ans;
    }
}