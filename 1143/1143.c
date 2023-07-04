int longestCommonSubsequence(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestCommonSubsequence(root->left);
    int r = longestCommonSubsequence(root->right);
    return 1 + (l > r ? l : r);
}