int minimumOperationsToMakeAllGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumOperationsToMakeAllGrid(root->left);
    int r = minimumOperationsToMakeAllGrid(root->right);
    return 1 + (l > r ? l : r);
}