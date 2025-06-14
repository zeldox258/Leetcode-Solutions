int matchAlphanumericalPatternInMa(struct TreeNode* root) {
    if (!root) return 0;
    int l = matchAlphanumericalPatternInMa(root->left);
    int r = matchAlphanumericalPatternInMa(root->right);
    return 1 + (l > r ? l : r);
}