class Solution {
    public int solve1611(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=1,end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=end){count++;end=intervals[i][1];}
        }
        return count;
    }
}