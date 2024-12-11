class Solution {
public:
    int kthSmallestSubarraySum(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};