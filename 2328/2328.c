int numberOfIncreasingPathsInAGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfIncreasingPathsInAGrid(root->left);
    int r = numberOfIncreasingPathsInAGrid(root->right);
    return 1 + (l > r ? l : r);
}