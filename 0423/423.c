int reconstructOriginalDigitsFromE(struct TreeNode* root) {
    if (!root) return 0;
    int l = reconstructOriginalDigitsFromE(root->left);
    int r = reconstructOriginalDigitsFromE(root->right);
    return 1 + (l > r ? l : r);
}