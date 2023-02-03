class Solution {
public:
    int sumOfNumberAndItsReverse(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};