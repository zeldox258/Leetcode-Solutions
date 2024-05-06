int maxDotProductOfTwoSubsequences(struct TreeNode* root) {
    if (!root) return 0;
    int l = maxDotProductOfTwoSubsequences(root->left);
    int r = maxDotProductOfTwoSubsequences(root->right);
    return 1 + (l > r ? l : r);
}