int candyCrush(struct TreeNode* root) {
    if (!root) return 0;
    int l = candyCrush(root->left);
    int r = candyCrush(root->right);
    return 1 + (l > r ? l : r);
}