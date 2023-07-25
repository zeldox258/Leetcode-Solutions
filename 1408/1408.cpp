class Solution {
public:
    int stringMatchingInAnArray(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};