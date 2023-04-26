class Solution {
public:
    int numberOfGoodBinaryStrings(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};