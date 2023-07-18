int marketAnalysisI(struct TreeNode* root) {
    if (!root) return 0;
    int l = marketAnalysisI(root->left);
    int r = marketAnalysisI(root->right);
    return 1 + (l > r ? l : r);
}