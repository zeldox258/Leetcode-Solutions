class Solution {
public:
    int heightOfSpecialBinaryTree(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};