int unitConversionI(struct TreeNode* root) {
    if (!root) return 0;
    int l = unitConversionI(root->left);
    int r = unitConversionI(root->right);
    return 1 + (l > r ? l : r);
}