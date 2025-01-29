int maximizeAreaOfSquareHoleInGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximizeAreaOfSquareHoleInGrid(root->left);
    int r = maximizeAreaOfSquareHoleInGrid(root->right);
    return 1 + (l > r ? l : r);
}