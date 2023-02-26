
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] jobs=new int[n][3];
        for(int i=0;i<n;i++) jobs[i]=new int[]{startTime[i],endTime[i],profit[i]};
        Arrays.sort(jobs,(a,b)->a[1]-b[1]);
        int[] ends=new int[n];
        for(int i=0;i<n;i++) ends[i]=jobs[i][1];
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++){
            int lo=0,hi=i;
            while(lo<hi){int m=(lo+hi)/2;if(ends[m]<=jobs[i][0])lo=m+1;else hi=m;}
            dp[i+1]=Math.max(dp[i],dp[lo]+jobs[i][2]);
        }
        return dp[n];
    }
}
