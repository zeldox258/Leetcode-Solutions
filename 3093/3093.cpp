class Solution {
public:
    int longestCommonSuffixQueries(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestCommonSuffixQueries(root->left),longestCommonSuffixQueries(root->right));
    }
};