
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0,hi=0; for(int w:weights){lo=Math.max(lo,w);hi+=w;}
        while(lo<hi){int mid=(lo+hi)/2;if(canShip(weights,days,mid))hi=mid;else lo=mid+1;} return lo;
    }
    boolean canShip(int[]w,int d,int cap){int days=1,cur=0;for(int v:w){if(cur+v>cap){days++;cur=0;}cur+=v;}return days<=d;}
}
