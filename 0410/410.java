
class Solution {
    public int splitArray(int[] nums, int k) {
        long lo=0,hi=0;
        for(int n:nums){lo=Math.max(lo,n);hi+=n;}
        while(lo<hi){long mid=lo+(hi-lo)/2;if(canSplit(nums,k,mid))hi=mid;else lo=mid+1;}
        return (int)lo;
    }
    boolean canSplit(int[] nums,int k,long max){int cnt=1;long sum=0;for(int n:nums){if(sum+n>max){cnt++;sum=0;if(cnt>k)return false;}sum+=n;}return true;}
}
