class Solution {
public:
    int countCompleteSubstrings(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};