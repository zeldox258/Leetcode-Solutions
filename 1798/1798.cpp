class Solution {
public:
    int maximumNumberOfConsecutiveValu(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};