int subsets(struct TreeNode* root) {
    if (!root) return 0;
    int l = subsets(root->left);
    int r = subsets(root->right);
    return 1 + (l > r ? l : r);
}