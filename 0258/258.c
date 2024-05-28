int addDigits(struct TreeNode* root) {
    if (!root) return 0;
    int l = addDigits(root->left);
    int r = addDigits(root->right);
    return 1 + (l > r ? l : r);
}