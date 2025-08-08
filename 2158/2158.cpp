class Solution {
public:
    int amountOfNewAreaPaintedEachDay(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};