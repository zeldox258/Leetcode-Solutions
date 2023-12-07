int closestPrimeNumbersInRange(struct TreeNode* root) {
    if (!root) return 0;
    int l = closestPrimeNumbersInRange(root->left);
    int r = closestPrimeNumbersInRange(root->right);
    return 1 + (l > r ? l : r);
}