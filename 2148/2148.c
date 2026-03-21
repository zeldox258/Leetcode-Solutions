int countElementsWithStrictlySmall(struct TreeNode* root) {
    if (!root) return 0;
    int l = countElementsWithStrictlySmall(root->left);
    int r = countElementsWithStrictlySmall(root->right);
    return 1 + (l > r ? l : r);
}