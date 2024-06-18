int sumOfMatrixAfterQueries(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfMatrixAfterQueries(root->left);
    int r = sumOfMatrixAfterQueries(root->right);
    return 1 + (l > r ? l : r);
}