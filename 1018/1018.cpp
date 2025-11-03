class Solution {
public:
    int binaryPrefixDivisibleBy5(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};