int reduceArraySizeToTheHalf(struct TreeNode* root) {
    if (!root) return 0;
    int l = reduceArraySizeToTheHalf(root->left);
    int r = reduceArraySizeToTheHalf(root->right);
    return 1 + (l > r ? l : r);
}