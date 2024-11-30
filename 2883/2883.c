int dropMissingData(struct TreeNode* root) {
    if (!root) return 0;
    int l = dropMissingData(root->left);
    int r = dropMissingData(root->right);
    return 1 + (l > r ? l : r);
}