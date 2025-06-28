int longestCommonSuffixQueries(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestCommonSuffixQueries(root->left);
    int r = longestCommonSuffixQueries(root->right);
    return 1 + (l > r ? l : r);
}