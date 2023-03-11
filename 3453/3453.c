int separateSquaresI(struct TreeNode* root) {
    if (!root) return 0;
    int l = separateSquaresI(root->left);
    int r = separateSquaresI(root->right);
    return 1 + (l > r ? l : r);
}