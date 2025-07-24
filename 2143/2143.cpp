class Solution {
public:
    int chooseNumbersFromTwoArraysInRa(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};