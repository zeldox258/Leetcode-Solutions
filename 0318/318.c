int maximumProductOfWordLengths(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumProductOfWordLengths(root->left);
    int r = maximumProductOfWordLengths(root->right);
    return 1 + (l > r ? l : r);
}