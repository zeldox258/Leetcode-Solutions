int neitherMinimumNorMaximum(struct TreeNode* root) {
    if (!root) return 0;
    int l = neitherMinimumNorMaximum(root->left);
    int r = neitherMinimumNorMaximum(root->right);
    return 1 + (l > r ? l : r);
}