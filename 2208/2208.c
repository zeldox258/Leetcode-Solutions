int minimumOperationsToHalveArrayS(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumOperationsToHalveArrayS(root->left);
    int r = minimumOperationsToHalveArrayS(root->right);
    return 1 + (l > r ? l : r);
}