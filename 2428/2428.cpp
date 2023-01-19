class Solution {
public:
    int maximumSumOfAnHourglass(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};