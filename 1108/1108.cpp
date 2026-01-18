class Solution {
public:
    int defangingAnIpAddress(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};