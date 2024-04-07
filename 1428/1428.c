int leftmostColumnWithAtLeastAOne(struct TreeNode* root) {
    if (!root) return 0;
    int l = leftmostColumnWithAtLeastAOne(root->left);
    int r = leftmostColumnWithAtLeastAOne(root->right);
    return 1 + (l > r ? l : r);
}