int maximizeSumOfSquaresOfDigits(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximizeSumOfSquaresOfDigits(root->left);
    int r = maximizeSumOfSquaresOfDigits(root->right);
    return 1 + (l > r ? l : r);
}