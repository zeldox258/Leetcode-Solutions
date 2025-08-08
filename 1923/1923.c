int longestCommonSubpath(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestCommonSubpath(root->left);
    int r = longestCommonSubpath(root->right);
    return 1 + (l > r ? l : r);
}