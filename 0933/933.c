int numberOfRecentCalls(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfRecentCalls(root->left);
    int r = numberOfRecentCalls(root->right);
    return 1 + (l > r ? l : r);
}