class Solution {
public:
    int minimumNumberOfFlipsToMakeTheB(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};