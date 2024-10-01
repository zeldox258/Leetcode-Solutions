int deepObjectFilter(struct TreeNode* root) {
    if (!root) return 0;
    int l = deepObjectFilter(root->left);
    int r = deepObjectFilter(root->right);
    return 1 + (l > r ? l : r);
}