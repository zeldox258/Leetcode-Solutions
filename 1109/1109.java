
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n+1];
        for(int[] b:bookings){ diff[b[0]-1]+=b[2]; if(b[1]<n) diff[b[1]]-=b[2]; }
        int[] res=new int[n];
        res[0]=diff[0];
        for(int i=1;i<n;i++) res[i]=res[i-1]+diff[i];
        return res;
    }
}
