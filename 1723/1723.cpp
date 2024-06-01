class Solution {
public:
    int findMinimumTimeToFinishAllJobs(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};