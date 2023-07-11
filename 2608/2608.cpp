class Solution {
public:
    int shortestCycleInAGraph(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};