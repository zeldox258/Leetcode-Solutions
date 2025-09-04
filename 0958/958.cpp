class Solution {
public:
    int checkCompletenessOfABinaryTree(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};