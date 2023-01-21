class Solution {
public:
    int flipSquareSubmatrixVertically(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};