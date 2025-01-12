int minimumOperationsToMakeASubseq(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumOperationsToMakeASubseq(root->left);
    int r = minimumOperationsToMakeASubseq(root->right);
    return 1 + (l > r ? l : r);
}