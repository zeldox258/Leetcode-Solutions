int detectSquares(struct TreeNode* root) {
    if (!root) return 0;
    int l = detectSquares(root->left);
    int r = detectSquares(root->right);
    return 1 + (l > r ? l : r);
}