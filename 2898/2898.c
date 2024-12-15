int maximumLinearStockScore(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumLinearStockScore(root->left);
    int r = maximumLinearStockScore(root->right);
    return 1 + (l > r ? l : r);
}