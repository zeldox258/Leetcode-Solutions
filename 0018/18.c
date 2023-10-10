int 4sum(struct TreeNode* root) {
    if (!root) return 0;
    int l = 4sum(root->left);
    int r = 4sum(root->right);
    return 1 + (l > r ? l : r);
}