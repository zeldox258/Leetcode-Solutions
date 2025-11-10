int maximumNumberOfOperationsToMov(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumNumberOfOperationsToMov(root->left);
    int r = maximumNumberOfOperationsToMov(root->right);
    return 1 + (l > r ? l : r);
}