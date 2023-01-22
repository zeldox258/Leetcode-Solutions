
class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int cur=q.poll();
            if(vis[cur]) continue;
            vis[cur]=true;
            if(arr[cur]==0) return true;
            if(cur+arr[cur]<n) q.offer(cur+arr[cur]);
            if(cur-arr[cur]>=0) q.offer(cur-arr[cur]);
        }
        return false;
    }
}
