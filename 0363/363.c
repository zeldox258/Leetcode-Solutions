int maxSumOfRectangleNoLargerThanK(struct TreeNode* root) {
    if (!root) return 0;
    int l = maxSumOfRectangleNoLargerThanK(root->left);
    int r = maxSumOfRectangleNoLargerThanK(root->right);
    return 1 + (l > r ? l : r);
}