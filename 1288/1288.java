
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int cnt=0,maxR=0;
        for(int[] iv:intervals){ if(iv[1]>maxR){cnt++;maxR=iv[1];} }
        return cnt;
    }
}
