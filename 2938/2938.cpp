class Solution {
public:
    int separateBlackAndWhiteBalls(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};