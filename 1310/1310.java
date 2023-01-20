
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] pre=new int[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]^arr[i];
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++) res[i]=pre[queries[i][1]+1]^pre[queries[i][0]];
        return res;
    }
}
