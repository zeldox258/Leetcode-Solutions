int largestSumOfAverages(struct TreeNode* root) {
    if (!root) return 0;
    int l = largestSumOfAverages(root->left);
    int r = largestSumOfAverages(root->right);
    return 1 + (l > r ? l : r);
}