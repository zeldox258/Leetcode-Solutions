
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length(),lo=1,hi=n-2;
        while(lo<hi){int mid=(lo+hi)/2;if(mountainArr.get(mid)<mountainArr.get(mid+1))lo=mid+1;else hi=mid;}
        int peak=lo; lo=0;hi=peak;
        while(lo<=hi){int mid=(lo+hi)/2,v=mountainArr.get(mid);if(v==target)return mid;if(v<target)lo=mid+1;else hi=mid-1;}
        lo=peak+1;hi=n-1; while(lo<=hi){int mid=(lo+hi)/2,v=mountainArr.get(mid);if(v==target)return mid;if(v>target)lo=mid+1;else hi=mid-1;}
        return -1;
    }
}
