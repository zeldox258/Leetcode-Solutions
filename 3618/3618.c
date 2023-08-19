int splitArrayByPrimeIndices(struct TreeNode* root) {
    if (!root) return 0;
    int l = splitArrayByPrimeIndices(root->left);
    int r = splitArrayByPrimeIndices(root->right);
    return 1 + (l > r ? l : r);
}