int findTheOriginalTypedStringIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = findTheOriginalTypedStringIi(root->left);
    int r = findTheOriginalTypedStringIi(root->right);
    return 1 + (l > r ? l : r);
}