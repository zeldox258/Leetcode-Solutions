int longestArithmeticSubsequenceOf(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestArithmeticSubsequenceOf(root->left);
    int r = longestArithmeticSubsequenceOf(root->right);
    return 1 + (l > r ? l : r);
}