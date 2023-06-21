
class Solution {
    public int missingElement(int[] nums, int k) {
        int lo=0,hi=nums.length-1;
        while(lo<hi){int mid=(lo+hi+1)/2;int missing=nums[mid]-nums[0]-mid;if(missing<k)lo=mid;else hi=mid-1;}
        return nums[lo]+k-(nums[lo]-nums[0]-lo);
    }
}
