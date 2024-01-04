class Solution {
public:
    int splitStringsBySeparator(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};