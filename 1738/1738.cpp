class Solution {
public:
    int findKthLargestXorCoordinateVal(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};