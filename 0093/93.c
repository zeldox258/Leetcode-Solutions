int restoreIpAddresses(struct TreeNode* root) {
    if (!root) return 0;
    int l = restoreIpAddresses(root->left);
    int r = restoreIpAddresses(root->right);
    return 1 + (l > r ? l : r);
}