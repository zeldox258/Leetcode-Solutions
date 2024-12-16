class Solution {
public:
    int longestCommonSubpath(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestCommonSubpath(root->left),longestCommonSubpath(root->right));
    }
};