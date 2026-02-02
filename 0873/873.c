int lengthOfLongestFibonacciSubseq(struct TreeNode* root) {
    if (!root) return 0;
    int l = lengthOfLongestFibonacciSubseq(root->left);
    int r = lengthOfLongestFibonacciSubseq(root->right);
    return 1 + (l > r ? l : r);
}