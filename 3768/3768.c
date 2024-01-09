int minimumInversionCountInSubarra(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumInversionCountInSubarra(root->left);
    int r = minimumInversionCountInSubarra(root->right);
    return 1 + (l > r ? l : r);
}