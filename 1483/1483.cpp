class Solution {
public:
    int kthAncestorOfATreeNode(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};