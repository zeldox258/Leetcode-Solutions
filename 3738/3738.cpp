class Solution {
public:
    int longestNondecreasingSubarrayAf(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestNondecreasingSubarrayAf(root->left),longestNondecreasingSubarrayAf(root->right));
    }
};