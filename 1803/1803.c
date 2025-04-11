int countPairsWithXorInARange(struct TreeNode* root) {
    if (!root) return 0;
    int l = countPairsWithXorInARange(root->left);
    int r = countPairsWithXorInARange(root->right);
    return 1 + (l > r ? l : r);
}