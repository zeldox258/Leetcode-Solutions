int longestFibonacciSubarray(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestFibonacciSubarray(root->left);
    int r = longestFibonacciSubarray(root->right);
    return 1 + (l > r ? l : r);
}