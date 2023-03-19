
class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int MOD=1000000007;
        long max=0,cur=0,total=0,maxPre=Long.MIN_VALUE,sumPre=0;
        for(int a:arr){total+=a;maxPre=Math.max(maxPre,sumPre+=a);}
        if(k==1){for(int a:arr){cur+=a;max=Math.max(max,cur);if(cur<0)cur=0;}return (int)(max%MOD);}
        long maxSuf=Long.MIN_VALUE,sumSuf=0;
        for(int i=arr.length-1;i>=0;i--) maxSuf=Math.max(maxSuf,sumSuf+=arr[i]);
        long ans=Math.max(0,Math.max(maxPre+maxSuf,maxPre+maxSuf+(long)(k-2)*Math.max(0,total)));
        return (int)(ans%MOD);
    }
}
