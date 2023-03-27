class Solution {
public:
    int removeCoveredIntervals(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};