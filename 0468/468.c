int validateIpAddress(struct TreeNode* root) {
    if (!root) return 0;
    int l = validateIpAddress(root->left);
    int r = validateIpAddress(root->right);
    return 1 + (l > r ? l : r);
}