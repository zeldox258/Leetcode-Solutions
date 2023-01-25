
class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n=arr.length;
        int[] pre=new int[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]+arr[i];
        int res=0,minDiff=Integer.MAX_VALUE;
        for(int v=1;v<=arr[arr.length-1];v++){
            int pos=lowerBound(arr,v);
            int sum=pre[pos]+v*(n-pos);
            if(Math.abs(sum-target)<minDiff){minDiff=Math.abs(sum-target);res=v;}
        }
        return res;
    }
    int lowerBound(int[] a,int v){int lo=0,hi=a.length;while(lo<hi){int m=(lo+hi)/2;if(a[m]<v)lo=m+1;else hi=m;}return lo;}
}
