class Solution {
public:
    int findAllNumbersDisappearedInAnA(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};