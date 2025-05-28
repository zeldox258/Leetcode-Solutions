class Solution {
public:
    int countSubstringsThatCanBeRearra(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};