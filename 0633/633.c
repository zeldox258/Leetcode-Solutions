int sumOfSquareNumbers(struct TreeNode* root) {
    if (!root) return 0;
    int l = sumOfSquareNumbers(root->left);
    int r = sumOfSquareNumbers(root->right);
    return 1 + (l > r ? l : r);
}