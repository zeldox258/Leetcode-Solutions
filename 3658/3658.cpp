class Solution {
public:
    int gcdOfOddAndEvenSums(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};