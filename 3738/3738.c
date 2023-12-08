int longestNondecreasingSubarrayAf(struct TreeNode* root) {
    if (!root) return 0;
    int l = longestNondecreasingSubarrayAf(root->left);
    int r = longestNondecreasingSubarrayAf(root->right);
    return 1 + (l > r ? l : r);
}