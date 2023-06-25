class Solution {
public:
    int replaceEmployeeIdWithTheUnique(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};