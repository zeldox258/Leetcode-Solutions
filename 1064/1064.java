
class Solution {
    public int fixedPoint(int[] arr) {
        int lo=0,hi=arr.length-1;
        while(lo<hi){int mid=(lo+hi)/2;if(arr[mid]<mid)lo=mid+1;else hi=mid;}
        return arr[lo]==lo?lo:-1;
    }
}
