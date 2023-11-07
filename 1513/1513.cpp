class Solution {
public:
    int numberOfSubstringsWithOnly1s(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};