int monotoneIncreasingDigits(struct TreeNode* root) {
    if (!root) return 0;
    int l = monotoneIncreasingDigits(root->left);
    int r = monotoneIncreasingDigits(root->right);
    return 1 + (l > r ? l : r);
}