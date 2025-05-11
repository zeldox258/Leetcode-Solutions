int maximumIceCreamBars(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumIceCreamBars(root->left);
    int r = maximumIceCreamBars(root->right);
    return 1 + (l > r ? l : r);
}