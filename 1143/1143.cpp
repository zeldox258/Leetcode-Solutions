class Solution {
public:
    int longestCommonSubsequence(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestCommonSubsequence(root->left),longestCommonSubsequence(root->right));
    }
};