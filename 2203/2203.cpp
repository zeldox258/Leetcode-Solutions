class Solution {
public:
    int minimumWeightedSubgraphWithThe(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};