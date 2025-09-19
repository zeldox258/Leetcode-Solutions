class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n=intervals.length;int[] starts=new int[n],ends=new int[n];
        for(int i=0;i<n;i++){starts[i]=intervals[i][0];ends[i]=intervals[i][1];}
        java.util.Arrays.sort(starts);java.util.Arrays.sort(ends);
        int rooms=0,endIdx=0;
        for(int i=0;i<n;i++){if(starts[i]<ends[endIdx])rooms++;else endIdx++;}
        return rooms;
    }
}