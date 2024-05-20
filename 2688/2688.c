int findActiveUsers(struct TreeNode* root) {
    if (!root) return 0;
    int l = findActiveUsers(root->left);
    int r = findActiveUsers(root->right);
    return 1 + (l > r ? l : r);
}