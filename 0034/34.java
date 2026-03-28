class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{find(nums,target,true), find(nums,target,false)};
    }
    int find(int[] nums, int t, boolean first) {
        int l=0,r=nums.length-1,res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==t){res=m;if(first)r=m-1;else l=m+1;}
            else if(nums[m]<t)l=m+1;else r=m-1;
        }
        return res;
    }
}