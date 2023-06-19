int queryKthSmallestTrimmedNumber(struct TreeNode* root) {
    if (!root) return 0;
    int l = queryKthSmallestTrimmedNumber(root->left);
    int r = queryKthSmallestTrimmedNumber(root->right);
    return 1 + (l > r ? l : r);
}