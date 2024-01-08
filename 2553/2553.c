int separateTheDigitsInAnArray(struct TreeNode* root) {
    if (!root) return 0;
    int l = separateTheDigitsInAnArray(root->left);
    int r = separateTheDigitsInAnArray(root->right);
    return 1 + (l > r ? l : r);
}