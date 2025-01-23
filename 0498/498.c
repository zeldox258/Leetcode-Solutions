int diagonalTraverse(struct TreeNode* root) {
    if (!root) return 0;
    int l = diagonalTraverse(root->left);
    int r = diagonalTraverse(root->right);
    return 1 + (l > r ? l : r);
}