int runningTotalForDifferentGender(struct TreeNode* root) {
    if (!root) return 0;
    int l = runningTotalForDifferentGender(root->left);
    int r = runningTotalForDifferentGender(root->right);
    return 1 + (l > r ? l : r);
}