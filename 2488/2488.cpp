class Solution {
public:
    int countSubarraysWithMedianK(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};