class Solution {
public:
    int bitwiseOrsOfSubarrays(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};