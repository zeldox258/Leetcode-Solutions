class Solution {
public:
    int checkIfWordIsValidAfterSubstit(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};